package com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.DeleteApplicantHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.applicant_history.ApplicantHistoryRepositoryPort;

public class DeleteApplicantHistoryUseCaseImp implements DeleteApplicantHistoryUseCase {
    private final ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort;
    public DeleteApplicantHistoryUseCaseImp(ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort){
        this.applicantHistoryRepositoryPort = applicantHistoryRepositoryPort;
    }

    @Override
    public boolean deleteApplicantHistory(Long id) {
        return applicantHistoryRepositoryPort.deleteById(id);
    }
}
