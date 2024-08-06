package com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;

import java.util.List;
import java.util.Optional;

public interface RetrieveApplicantHistoryUseCase {
    Optional<ApplicantHistory> getApplicantHistory(Long id);
    List<ApplicantHistory> getAllApplicantHistory();
}
