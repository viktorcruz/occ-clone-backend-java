package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.employee_history.EmployeeHistoryRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.EmployeeHistoryEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.PublicationEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaEmployeeHistoryRepositoryAdapter implements EmployeeHistoryRepositoryPort {
    private final JpaEmployeeHistoryRepository jpaEmployeeHistoryRepository;
    private final JpaUserRepository jpaUserRepository;
    private final JpaPublicationRepository jpaPublicationRepository;

    public JpaEmployeeHistoryRepositoryAdapter(
            JpaEmployeeHistoryRepository jpaEmployeeHistoryRepository,
            JpaUserRepository jpaUserRepository,
            JpaPublicationRepository jpaPublicationRepository
    ){
        this.jpaEmployeeHistoryRepository = jpaEmployeeHistoryRepository;
        this.jpaPublicationRepository = jpaPublicationRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public EmployeeHistory save(EmployeeHistory employeeHistory) {
        UserEntity userEntity = jpaUserRepository.findById(employeeHistory.getIdApplicant())
                .orElseThrow(()-> new RuntimeException("Applicant not found"));
        PublicationEntity publicationEntity = jpaPublicationRepository.findById(employeeHistory.getIdPublication())
                .orElseThrow(()->new RuntimeException("Publication not found"));

        EmployeeHistoryEntity employeeHistoryEntity = EmployeeHistoryEntity.fromDomainModel(employeeHistory, userEntity, publicationEntity);
        EmployeeHistoryEntity saveEmployeeHistoryEntity = jpaEmployeeHistoryRepository.save(employeeHistoryEntity);
        return saveEmployeeHistoryEntity.toDomainModel();
    }

    @Override
    public Optional<EmployeeHistory> findById(Long id) {
        return jpaEmployeeHistoryRepository.findById(id)
                .map(EmployeeHistoryEntity::toDomainModel);
    }

    @Override
    public List<EmployeeHistory> findAll() {
        return jpaEmployeeHistoryRepository.findAll()
                .stream().map(EmployeeHistoryEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<EmployeeHistory> update(EmployeeHistory employeeHistory) {
        if(jpaEmployeeHistoryRepository.existsById(employeeHistory.getId())){
            UserEntity userEntity = jpaUserRepository.findById(employeeHistory.getIdApplicant())
                    .orElseThrow(()-> new RuntimeException("Applicant not found"));
            PublicationEntity publicationEntity = jpaPublicationRepository.findById(employeeHistory.getIdPublication())
                    .orElseThrow(()->new RuntimeException("Publication not found"));

            EmployeeHistoryEntity employeeHistoryEntity = EmployeeHistoryEntity.fromDomainModel(employeeHistory, userEntity, publicationEntity);
            EmployeeHistoryEntity updateEmployeeHistoryEntity = jpaEmployeeHistoryRepository.save(employeeHistoryEntity);
            return Optional.of(updateEmployeeHistoryEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaEmployeeHistoryRepository.existsById(id)){
            jpaEmployeeHistoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
