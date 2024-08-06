package com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.RetrieveApplicantHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.applicant_history.ApplicantHistoryRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveApplicantHistoryUseCoseImp implements RetrieveApplicantHistoryUseCase {
    private final ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort;

    public RetrieveApplicantHistoryUseCoseImp(ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort){
        this.applicantHistoryRepositoryPort = applicantHistoryRepositoryPort;
    }

    @Override
    public Optional<ApplicantHistory> getApplicantHistory(Long id) {
        return applicantHistoryRepositoryPort.findById(id);
    }

    @Override
    public List<ApplicantHistory> getAllApplicantHistory() {
        return applicantHistoryRepositoryPort.findAll();
    }
}
