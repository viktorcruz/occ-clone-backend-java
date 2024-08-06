package com.lastsys.hexagonal.occ_clone.domain.ports.out.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;

import java.util.List;
import java.util.Optional;

public interface ApplicantHistoryRepositoryPort {
    ApplicantHistory save(ApplicantHistory applicantHistory);
    Optional<ApplicantHistory> findById(Long id);
    List<ApplicantHistory> findAll();
    Optional<ApplicantHistory> update(ApplicantHistory applicantHistory);
    boolean deleteById(Long id);
}
