package com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.UpdateApplicantHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.applicant_history.ApplicantHistoryRepositoryPort;

import java.util.Optional;

public class UpdateApplicantHistoryUseCaseImp implements UpdateApplicantHistoryUseCase {
    private final ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort;

    public UpdateApplicantHistoryUseCaseImp(ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort){
        this.applicantHistoryRepositoryPort = applicantHistoryRepositoryPort;
    }

    @Override
    public Optional<ApplicantHistory> updateApplicantHistory(Long id, ApplicantHistory applicantHistory) {
        return applicantHistoryRepositoryPort.update(applicantHistory);
    }
}
