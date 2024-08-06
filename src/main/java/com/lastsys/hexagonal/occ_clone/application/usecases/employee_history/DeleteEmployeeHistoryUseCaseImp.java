package com.lastsys.hexagonal.occ_clone.application.usecases.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.DeleteEmployeeHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.employee_history.EmployeeHistoryRepositoryPort;

public class DeleteEmployeeHistoryUseCaseImp implements DeleteEmployeeHistoryUseCase {
    private final EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort;

    public DeleteEmployeeHistoryUseCaseImp(EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort){
        this.employeeHistoryRepositoryPort = employeeHistoryRepositoryPort;
    }

    @Override
    public boolean deleteEmployeeHistory(Long id) {
        return employeeHistoryRepositoryPort.deleteById(id);
    }
}
