package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.applicant_history.ApplicantHistoryRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.ApplicantHistoryEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.PublicationEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaApplicantHistoryRepositoryAdapter implements ApplicantHistoryRepositoryPort {

    private final JpaApplicantHistoryRepository jpaApplicantHistoryRepository;
    private final JpaUserRepository jpaUserRepository;
    private final JpaPublicationRepository jpaPublicationRepository;

    public JpaApplicantHistoryRepositoryAdapter(
            JpaApplicantHistoryRepository jpaApplicantHistoryRepository,
            JpaUserRepository jpaUserRepository,
            JpaPublicationRepository jpaPublicationRepository
    ){
        this.jpaApplicantHistoryRepository = jpaApplicantHistoryRepository;
        this.jpaUserRepository = jpaUserRepository;
        this.jpaPublicationRepository = jpaPublicationRepository;
    }

    @Override
    public ApplicantHistory save(ApplicantHistory applicantHistory) {
        UserEntity userEntity = jpaUserRepository.findById(applicantHistory.getIdApplicant())
                .orElseThrow(()->new RuntimeException("Applicant not found"));
        PublicationEntity publicationEntity = jpaPublicationRepository.findById(applicantHistory.getIdPublication())
                .orElseThrow(()-> new RuntimeException("Publication not found"));

        ApplicantHistoryEntity applicantHistoryEntity = ApplicantHistoryEntity.fromDomainModel(applicantHistory, userEntity, publicationEntity);
        ApplicantHistoryEntity saveApplicantHistoryEntity = jpaApplicantHistoryRepository.save(applicantHistoryEntity);

        return saveApplicantHistoryEntity.toDomainModel();
    }

    @Override
    public Optional<ApplicantHistory> findById(Long id) {
        return jpaApplicantHistoryRepository.findById(id)
                .map(ApplicantHistoryEntity::toDomainModel);
    }

    @Override
    public List<ApplicantHistory> findAll() {
        return jpaApplicantHistoryRepository.findAll()
                .stream().map(ApplicantHistoryEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ApplicantHistory> update(ApplicantHistory applicantHistory) {
        if(jpaApplicantHistoryRepository.existsById(applicantHistory.getId())){
            UserEntity userEntity = jpaUserRepository.findById(applicantHistory.getIdApplicant())
                    .orElseThrow(()-> new RuntimeException("Applicant not found"));
            PublicationEntity publicationEntity = jpaPublicationRepository.findById(applicantHistory.getIdPublication())
                    .orElseThrow(()->new RuntimeException("Publication not found"));

            ApplicantHistoryEntity applicantHistoryEntity = ApplicantHistoryEntity.fromDomainModel(applicantHistory, userEntity, publicationEntity);
            ApplicantHistoryEntity updateApplicantEntity = jpaApplicantHistoryRepository.save(applicantHistoryEntity);
            return Optional.of(updateApplicantEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaApplicantHistoryRepository.existsById(id)){
            jpaApplicantHistoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
