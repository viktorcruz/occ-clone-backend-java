package com.lastsys.hexagonal.occ_clone.application.usecases.company_history;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.DeleteCompanyHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.company_history.CompanyHistoryRepositoryPort;

public class DeleteCompanyHistoryUseCaseImp implements DeleteCompanyHistoryUseCase {
    private final CompanyHistoryRepositoryPort companyHistoryRepositoryPort;

    public DeleteCompanyHistoryUseCaseImp(CompanyHistoryRepositoryPort companyHistoryRepositoryPort){
        this.companyHistoryRepositoryPort = companyHistoryRepositoryPort;
    }

    @Override
    public boolean deleteCompanyHistory(Long id) {
        return companyHistoryRepositoryPort.deleteById(id);
    }
}
