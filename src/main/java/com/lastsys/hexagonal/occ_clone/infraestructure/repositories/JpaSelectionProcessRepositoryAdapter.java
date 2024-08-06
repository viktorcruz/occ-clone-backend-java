package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.selection_process.SelectionProcessRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.PublicationEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.SelectionProcessEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaSelectionProcessRepositoryAdapter implements SelectionProcessRepositoryPort {
    private final JpaSelectionProcessRepository jpaSelectionProcessRepository;
    private final JpaPublicationRepository jpaPublicationRepository;
    private final JpaUserRepository jpaUserRepository;

    public JpaSelectionProcessRepositoryAdapter(
            JpaSelectionProcessRepository jpaSelectionProcessRepository,
            JpaUserRepository jpaUserRepository,
            JpaPublicationRepository jpaPublicationRepository
    ){
        this.jpaSelectionProcessRepository = jpaSelectionProcessRepository;
        this.jpaUserRepository = jpaUserRepository;
        this.jpaPublicationRepository = jpaPublicationRepository;
    }

    @Override
    public SelectionProcess save(SelectionProcess selectionProcess) {
        UserEntity userEntity = jpaUserRepository.findById(selectionProcess.getIdApplicant())
                .orElseThrow(()-> new RuntimeException("Applicant not found"));
        PublicationEntity publicationEntity = jpaPublicationRepository.findById(selectionProcess.getIdPublication())
                .orElseThrow(()-> new RuntimeException("Publication not found"));

        SelectionProcessEntity selectionProcessEntity = SelectionProcessEntity.fromDomainModel(selectionProcess, userEntity, publicationEntity);
        SelectionProcessEntity saveSelectionProcessEntity = jpaSelectionProcessRepository.save(selectionProcessEntity);
        return saveSelectionProcessEntity.toDomainModel();
    }

    @Override
    public Optional<SelectionProcess> findById(Long id) {
        return jpaSelectionProcessRepository.findById(id)
                .map(SelectionProcessEntity::toDomainModel);
    }

    @Override
    public List<SelectionProcess> findAll() {
        return jpaSelectionProcessRepository.findAll()
                .stream().map(SelectionProcessEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<SelectionProcess> update(SelectionProcess selectionProcess) {
        if(jpaSelectionProcessRepository.existsById(selectionProcess.getId())){
            UserEntity userEntity = jpaUserRepository.findById(selectionProcess.getIdApplicant())
                    .orElseThrow(()-> new RuntimeException("Applicant not found"));
            PublicationEntity publicationEntity = jpaPublicationRepository.findById(selectionProcess.getIdPublication())
                    .orElseThrow(()-> new RuntimeException("Publication not found"));

            SelectionProcessEntity selectionProcessEntity = SelectionProcessEntity.fromDomainModel(selectionProcess, userEntity, publicationEntity);
            SelectionProcessEntity updateSelectionProcessEntity = jpaSelectionProcessRepository.save(selectionProcessEntity);
            return Optional.of(updateSelectionProcessEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaSelectionProcessRepository.existsById(id)){
            jpaSelectionProcessRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
