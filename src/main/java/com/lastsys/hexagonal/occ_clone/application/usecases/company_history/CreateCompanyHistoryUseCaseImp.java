package com.lastsys.hexagonal.occ_clone.application.usecases.company_history;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.CreateCompanyHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.company_history.CompanyHistoryRepositoryPort;

public class CreateCompanyHistoryUseCaseImp implements CreateCompanyHistoryUseCase {
    private final CompanyHistoryRepositoryPort companyHistoryRepositoryPort;

    public CreateCompanyHistoryUseCaseImp(CompanyHistoryRepositoryPort companyHistoryRepositoryPort){
        this.companyHistoryRepositoryPort = companyHistoryRepositoryPort;
    }
    @Override
    public CompanyHistory createCompanyHistory(CompanyHistory companyHistory) {
        return companyHistoryRepositoryPort.save(companyHistory);
    }
}
