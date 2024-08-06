package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.CreateCompanyHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.DeleteCompanyHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.RetrieveCompanyHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history.UpdateCompanyHistoryUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyHistoryService implements CreateCompanyHistoryUseCase, DeleteCompanyHistoryUseCase, RetrieveCompanyHistoryUseCase, UpdateCompanyHistoryUseCase {
    private CreateCompanyHistoryUseCase createCompanyHistoryUseCase;
    private DeleteCompanyHistoryUseCase deleteCompanyHistoryUseCase;
    private RetrieveCompanyHistoryUseCase retrieveCompanyHistoryUseCase;
    private UpdateCompanyHistoryUseCase updateCompanyHistoryUseCase;

    public CompanyHistoryService(
            CreateCompanyHistoryUseCase createCompanyHistoryUseCase,
            DeleteCompanyHistoryUseCase deleteCompanyHistoryUseCase,
            RetrieveCompanyHistoryUseCase retrieveCompanyHistoryUseCase,
            UpdateCompanyHistoryUseCase updateCompanyHistoryUseCase
    ){
        this.createCompanyHistoryUseCase = createCompanyHistoryUseCase;
        this.deleteCompanyHistoryUseCase = deleteCompanyHistoryUseCase;
        this.retrieveCompanyHistoryUseCase = retrieveCompanyHistoryUseCase;
        this.updateCompanyHistoryUseCase = updateCompanyHistoryUseCase;
    }


    @Override
    public CompanyHistory createCompanyHistory(CompanyHistory companyHistory) {
        return createCompanyHistoryUseCase.createCompanyHistory(companyHistory);
    }

    @Override
    public boolean deleteCompanyHistory(Long id) {
        return deleteCompanyHistoryUseCase.deleteCompanyHistory(id);
    }

    @Override
    public Optional<CompanyHistory> getCompanyHistory(Long id) {
        return retrieveCompanyHistoryUseCase.getCompanyHistory(id);
    }

    @Override
    public List<CompanyHistory> getAllCompanyHistory() {
        return retrieveCompanyHistoryUseCase.getAllCompanyHistory();
    }

    @Override
    public Optional<CompanyHistory> updateCompanyHistory(Long id, CompanyHistory companyHistory) {
        return updateCompanyHistoryUseCase.updateCompanyHistory(id, companyHistory);
    }
}
