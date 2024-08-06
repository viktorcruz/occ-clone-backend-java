package com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;

import java.util.Optional;

public interface UpdateCompanyHistoryUseCase {
    Optional<CompanyHistory> updateCompanyHistory(Long id, CompanyHistory companyHistory);
}
