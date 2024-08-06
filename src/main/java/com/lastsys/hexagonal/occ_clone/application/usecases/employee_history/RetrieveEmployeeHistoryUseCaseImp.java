package com.lastsys.hexagonal.occ_clone.application.usecases.employee_history;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.RetrieveEmployeeHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.employee_history.EmployeeHistoryRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveEmployeeHistoryUseCaseImp implements RetrieveEmployeeHistoryUseCase {
    private final EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort;

    public RetrieveEmployeeHistoryUseCaseImp(EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort){
        this.employeeHistoryRepositoryPort = employeeHistoryRepositoryPort;
    }

    @Override
    public Optional<EmployeeHistory> getEmployeeHistory(Long id) {
        return employeeHistoryRepositoryPort.findById(id);
    }

    @Override
    public List<EmployeeHistory> getAllEmployeeHistory() {
        return employeeHistoryRepositoryPort.findAll();
    }
}
