package com.lastsys.hexagonal.occ_clone.domain.ports.out.company_history;

import com.lastsys.hexagonal.occ_clone.domain.models.CompanyHistory;

import java.util.List;
import java.util.Optional;

public interface CompanyHistoryRepositoryPort {
    CompanyHistory save(CompanyHistory companyHistory);
    Optional<CompanyHistory> findById(Long id);
    List<CompanyHistory> findAll();
    Optional<CompanyHistory> update(CompanyHistory companyHistory);
    boolean deleteById(Long id);
}
