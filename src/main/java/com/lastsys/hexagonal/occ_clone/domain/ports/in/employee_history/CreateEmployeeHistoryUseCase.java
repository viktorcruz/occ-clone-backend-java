package com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;

public interface CreateEmployeeHistoryUseCase {
    EmployeeHistory createEmployeeHistory(EmployeeHistory employeeHistory);
}
