package com.lastsys.hexagonal.occ_clone.application.usecases.company_history;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.UpdateCompanyHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.company_history.CompanyHistoryRepositoryPort;

import java.util.Optional;

public class UpdateCompanyHistoryUseCaseImp implements UpdateCompanyHistoryUseCase {
    private final CompanyHistoryRepositoryPort companyHistoryRepositoryPort;

    public UpdateCompanyHistoryUseCaseImp(CompanyHistoryRepositoryPort companyHistoryRepositoryPort){
        this.companyHistoryRepositoryPort = companyHistoryRepositoryPort;
    }

    @Override
    public Optional<CompanyHistory> updateCompanyHistory(Long id, CompanyHistory companyHistory) {
        return companyHistoryRepositoryPort.update(companyHistory);
    }
}
