package com.lastsys.hexagonal.occ_clone.domain.ports.in.company_history;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;

public interface CreateCompanyHistoryUseCase {
    CompanyHistory createCompanyHistory(CompanyHistory companyHistory);
}
