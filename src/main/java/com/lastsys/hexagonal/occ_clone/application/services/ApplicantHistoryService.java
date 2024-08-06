package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.ApplicantHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.CreateApplicantHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.DeleteApplicantHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.RetrieveApplicantHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.applicant_history.UpdateApplicantHistoryUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantHistoryService implements CreateApplicantHistoryUseCase, DeleteApplicantHistoryUseCase, RetrieveApplicantHistoryUseCase, UpdateApplicantHistoryUseCase {
    private final CreateApplicantHistoryUseCase createApplicantHistoryUseCase;
    private final DeleteApplicantHistoryUseCase deleteApplicantHistoryUseCase;
    private final RetrieveApplicantHistoryUseCase retrieveApplicantHistoryUseCase;
    private final UpdateApplicantHistoryUseCase updateApplicantHistoryUseCase;

    public ApplicantHistoryService(
            CreateApplicantHistoryUseCase createApplicantHistoryUseCase,
            DeleteApplicantHistoryUseCase deleteApplicantHistoryUseCase,
            RetrieveApplicantHistoryUseCase retrieveApplicantHistoryUseCase,
            UpdateApplicantHistoryUseCase updateApplicantHistoryUseCase
    ){
        this.createApplicantHistoryUseCase = createApplicantHistoryUseCase;
        this.deleteApplicantHistoryUseCase = deleteApplicantHistoryUseCase;
        this.retrieveApplicantHistoryUseCase = retrieveApplicantHistoryUseCase;
        this.updateApplicantHistoryUseCase = updateApplicantHistoryUseCase;
    }

    @Override
    public ApplicantHistory createApplicantHistory(ApplicantHistory applicantHistory) {
        return createApplicantHistoryUseCase.createApplicantHistory(applicantHistory);
    }

    @Override
    public boolean deleteApplicantHistory(Long id) {
        return deleteApplicantHistoryUseCase.deleteApplicantHistory(id);
    }

    @Override
    public Optional<ApplicantHistory> getApplicantHistory(Long id) {
        return retrieveApplicantHistoryUseCase.getApplicantHistory(id);
    }

    @Override
    public List<ApplicantHistory> getAllApplicantHistory() {
        return retrieveApplicantHistoryUseCase.getAllApplicantHistory();
    }

    @Override
    public Optional<ApplicantHistory> updateApplicantHistory(Long id, ApplicantHistory applicantHistory) {
        return updateApplicantHistoryUseCase.updateApplicantHistory(id, applicantHistory);
    }
}
