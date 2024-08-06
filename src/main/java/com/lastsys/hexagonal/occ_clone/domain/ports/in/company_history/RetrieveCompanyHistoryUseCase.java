package com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;

import java.util.List;
import java.util.Optional;

public interface RetrieveCompanyHistoryUseCase {
    Optional<CompanyHistory> getCompanyHistory(Long id);
    List<CompanyHistory> getAllCompanyHistory();
}
