package com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;

public interface CreateApplicantHistoryUseCase {
    ApplicantHistory createApplicantHistory(ApplicantHistory applicantHistory);
}
