package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.publication.PublicationRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.PublicationEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.RoleEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaPublicationRepositoryAdapter implements PublicationRepositoryPort {
    private final JpaUserRepository jpaUserRepository;
    private final JpaRoleRepository jpaRoleRepository;
    private final JpaPublicationRepository jpaPublicationRepository;

    public JpaPublicationRepositoryAdapter(
            JpaPublicationRepository jpaPublicationRepository,
            JpaUserRepository jpaUserRepository,
            JpaRoleRepository jpaRoleRepository
    ){
        this.jpaPublicationRepository = jpaPublicationRepository;
        this.jpaUserRepository = jpaUserRepository;
        this.jpaRoleRepository = jpaRoleRepository;
    }

    @Override
    public Publication save(Publication publication) {
        UserEntity userEntity = jpaUserRepository.findById(publication.getIdRecruiter())
                .orElseThrow(() -> new RuntimeException("Recruiter not found"));
        RoleEntity roleEntity = jpaRoleRepository.findById(publication.getIdRole())
                .orElseThrow(()->new RuntimeException("Role not found"));

        PublicationEntity publicationEntity = PublicationEntity.fromDomainModel(publication, userEntity, roleEntity);
        PublicationEntity savePublicationEntity = jpaPublicationRepository.save(publicationEntity);
        return savePublicationEntity.toDomainModel();
    }


    @Override
    public Optional<Publication> findById(Long id) {
        return jpaPublicationRepository.findById(id)
                .map(PublicationEntity::toDomainModel);
    }

    @Override
    public List<Publication> findAll() {
        return jpaPublicationRepository.findAll()
                .stream().map(PublicationEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Publication> update(Publication publication) {
        if(jpaPublicationRepository.existsById(publication.getId())){
            UserEntity userEntity = jpaUserRepository.findById(publication.getId())
                    .orElseThrow(()-> new RuntimeException("Recruiter not found"));
            RoleEntity roleEntity = jpaRoleRepository.findById(publication.getIdRole())
                    .orElseThrow(() -> new RuntimeException("Role not found"));

            PublicationEntity publicationEntity = PublicationEntity.fromDomainModel(publication, userEntity, roleEntity);
            PublicationEntity updatePublicationEntity = jpaPublicationRepository.save(publicationEntity);
            return Optional.of(updatePublicationEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaPublicationRepository.existsById(id)){
            jpaPublicationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
