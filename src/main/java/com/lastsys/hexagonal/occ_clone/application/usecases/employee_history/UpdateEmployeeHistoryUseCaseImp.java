package com.lastsys.hexagonal.occ_clone.application.usecases.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.UpdateEmployeeHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.employee_history.EmployeeHistoryRepositoryPort;

import java.util.Optional;

public class UpdateEmployeeHistoryUseCaseImp implements UpdateEmployeeHistoryUseCase {
    private final EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort;

    public UpdateEmployeeHistoryUseCaseImp(EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort){
        this.employeeHistoryRepositoryPort = employeeHistoryRepositoryPort;
    }

    @Override
    public Optional<EmployeeHistory> updateEmployeeHistory(Long id, EmployeeHistory employeeHistory) {
        return employeeHistoryRepositoryPort.update(employeeHistory);
    }
}
