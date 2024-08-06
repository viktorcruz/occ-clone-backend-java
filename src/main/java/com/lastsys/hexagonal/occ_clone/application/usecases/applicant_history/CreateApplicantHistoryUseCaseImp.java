package com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.CreateApplicantHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.applicant_history.ApplicantHistoryRepositoryPort;

public class CreateApplicantHistoryUseCaseImp implements CreateApplicantHistoryUseCase {

    private final ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort;

    public CreateApplicantHistoryUseCaseImp(ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort){
        this.applicantHistoryRepositoryPort = applicantHistoryRepositoryPort;
    }
    @Override
    public ApplicantHistory createApplicantHistory(ApplicantHistory applicantHistory) {
        return applicantHistoryRepositoryPort.save(applicantHistory);
    }
}
