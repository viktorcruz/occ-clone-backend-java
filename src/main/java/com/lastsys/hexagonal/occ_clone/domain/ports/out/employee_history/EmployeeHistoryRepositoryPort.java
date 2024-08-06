package com.lastsys.hexagonal.occ_clone.domain.ports.out.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;

import java.util.List;
import java.util.Optional;

public interface EmployeeHistoryRepositoryPort {
    EmployeeHistory save(EmployeeHistory employeeHistory);
    Optional<EmployeeHistory> findById(Long id);
    List<EmployeeHistory> findAll();
    Optional<EmployeeHistory> update(EmployeeHistory employeeHistory);
    boolean deleteById(Long id);
}
