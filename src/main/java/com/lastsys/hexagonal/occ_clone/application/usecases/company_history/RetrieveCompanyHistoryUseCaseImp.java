package com.lastsys.hexagonal.occ_clone.application.usecases.company_history;

import com.lastsys.hexagonal.occ_clone.application.usecases.publication.RetrievePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.RetrieveCompanyHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.company_history.CompanyHistoryRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveCompanyHistoryUseCaseImp implements RetrieveCompanyHistoryUseCase {
    private final CompanyHistoryRepositoryPort companyHistoryRepositoryPort;

    public RetrieveCompanyHistoryUseCaseImp(CompanyHistoryRepositoryPort companyHistoryRepositoryPort){
        this.companyHistoryRepositoryPort = companyHistoryRepositoryPort;
    }

    @Override
    public Optional<CompanyHistory> getCompanyHistory(Long id) {
        return companyHistoryRepositoryPort.findById(id);
    }

    @Override
    public List<CompanyHistory> getAllCompanyHistory() {
        return companyHistoryRepositoryPort.findAll();
    }
}
