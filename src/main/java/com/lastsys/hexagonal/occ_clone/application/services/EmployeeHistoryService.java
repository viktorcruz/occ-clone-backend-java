package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.EmployeeHistory;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.CreateEmployeeHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.DeleteEmployeeHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.RetrieveEmployeeHistoryUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.employee_history.UpdateEmployeeHistoryUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeHistoryService implements CreateEmployeeHistoryUseCase, DeleteEmployeeHistoryUseCase, RetrieveEmployeeHistoryUseCase, UpdateEmployeeHistoryUseCase {
    private CreateEmployeeHistoryUseCase createEmployeeHistoryUseCase;
    private DeleteEmployeeHistoryUseCase deleteEmployeeHistoryUseCase;
    private RetrieveEmployeeHistoryUseCase retrieveEmployeeHistoryUseCase;
    private UpdateEmployeeHistoryUseCase updateEmployeeHistoryUseCase;

    public EmployeeHistoryService(
            CreateEmployeeHistoryUseCase createEmployeeHistoryUseCase,
            DeleteEmployeeHistoryUseCase deleteEmployeeHistoryUseCase,
            RetrieveEmployeeHistoryUseCase retrieveEmployeeHistoryUseCase,
            UpdateEmployeeHistoryUseCase updateEmployeeHistoryUseCase
    ){
        this.createEmployeeHistoryUseCase = createEmployeeHistoryUseCase;
        this.deleteEmployeeHistoryUseCase = deleteEmployeeHistoryUseCase;
        this.retrieveEmployeeHistoryUseCase = retrieveEmployeeHistoryUseCase;
        this.updateEmployeeHistoryUseCase = updateEmployeeHistoryUseCase;
    }

    @Override
    public EmployeeHistory createEmployeeHistory(EmployeeHistory employeeHistory) {
        return createEmployeeHistoryUseCase.createEmployeeHistory(employeeHistory);
    }

    @Override
    public boolean deleteEmployeeHistory(Long id) {
        return deleteEmployeeHistoryUseCase.deleteEmployeeHistory(id);
    }

    @Override
    public Optional<EmployeeHistory> getEmployeeHistory(Long id) {
        return retrieveEmployeeHistoryUseCase.getEmployeeHistory(id);
    }

    @Override
    public List<EmployeeHistory> getAllEmployeeHistory() {
        return retrieveEmployeeHistoryUseCase.getAllEmployeeHistory();
    }

    @Override
    public Optional<EmployeeHistory> updateEmployeeHistory(Long id, EmployeeHistory employeeHistory) {
        return updateEmployeeHistoryUseCase.updateEmployeeHistory(id, employeeHistory);
    }
}
