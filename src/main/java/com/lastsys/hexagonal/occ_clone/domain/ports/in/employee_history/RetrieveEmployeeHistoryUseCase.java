package com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;

import java.util.List;
import java.util.Optional;

public interface RetrieveEmployeeHistoryUseCase {
    Optional<EmployeeHistory> getEmployeeHistory(Long id);
    List<EmployeeHistory> getAllEmployeeHistory();
}
