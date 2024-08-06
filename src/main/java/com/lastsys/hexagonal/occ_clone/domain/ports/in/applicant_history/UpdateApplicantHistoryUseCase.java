package com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;

import java.util.Optional;

public interface UpdateApplicantHistoryUseCase {
    Optional<ApplicantHistory> updateApplicantHistory(Long id, ApplicantHistory applicantHistory);
}
