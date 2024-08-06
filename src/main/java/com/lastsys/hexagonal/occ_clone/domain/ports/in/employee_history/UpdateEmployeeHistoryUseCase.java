package com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;

import java.util.Optional;

public interface UpdateEmployeeHistoryUseCase {
    Optional<EmployeeHistory> updateEmployeeHistory(Long id, EmployeeHistory employeeHistory);
}
