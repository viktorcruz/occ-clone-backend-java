package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.company_history.CompanyHistoryRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.CompanyHistoryEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.PublicationEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCompanyHistoryRepositoryAdapter implements CompanyHistoryRepositoryPort {
    private final JpaCompanyHistoryRepository jpaCompanyHistoryRepository;
    private final JpaUserRepository jpaUserRepository;
    private final JpaPublicationRepository jpaPublicationRepository;

    public JpaCompanyHistoryRepositoryAdapter(
            JpaCompanyHistoryRepository jpaCompanyHistoryRepository,
            JpaUserRepository jpaUserRepository,
            JpaPublicationRepository jpaPublicationRepository
    ){
        this.jpaPublicationRepository = jpaPublicationRepository;
        this.jpaCompanyHistoryRepository = jpaCompanyHistoryRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public CompanyHistory save(CompanyHistory companyHistory) {
        UserEntity userEntity = jpaUserRepository.findById(companyHistory.getIdRecruiter())
                .orElseThrow(()->new RuntimeException("Recruiter not found"));
        PublicationEntity publicationEntity = jpaPublicationRepository.findById(companyHistory.getIdPublication())
                .orElseThrow(()-> new RuntimeException("Publication not found"));
        CompanyHistoryEntity companyHistoryEntity = CompanyHistoryEntity.fromDomainModel(companyHistory, userEntity, publicationEntity);
        CompanyHistoryEntity saveCompanyHistoryEntity = jpaCompanyHistoryRepository.save(companyHistoryEntity);
        return saveCompanyHistoryEntity.toDomainModel();
    }

    @Override
    public Optional<CompanyHistory> findById(Long id) {
        return jpaCompanyHistoryRepository.findById(id).map(CompanyHistoryEntity::toDomainModel);
    }

    @Override
    public List<CompanyHistory> findAll() {
        return jpaCompanyHistoryRepository.findAll()
                .stream().map(CompanyHistoryEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CompanyHistory> update(CompanyHistory companyHistory) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaCompanyHistoryRepository.existsById(id)){
            jpaCompanyHistoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
