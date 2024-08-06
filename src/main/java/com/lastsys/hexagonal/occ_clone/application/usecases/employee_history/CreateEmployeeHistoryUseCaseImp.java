package com.lastsys.hexagonal.occ_clone.application.usecases.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.CreateEmployeeHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.employee_history.EmployeeHistoryRepositoryPort;

public class CreateEmployeeHistoryUseCaseImp implements CreateEmployeeHistoryUseCase {
    private final EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort;

    public CreateEmployeeHistoryUseCaseImp(EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort){
        this.employeeHistoryRepositoryPort = employeeHistoryRepositoryPort;
    }

    @Override
    public EmployeeHistory createEmployeeHistory(EmployeeHistory employeeHistory) {
        return employeeHistoryRepositoryPort.save(employeeHistory);
    }
}
