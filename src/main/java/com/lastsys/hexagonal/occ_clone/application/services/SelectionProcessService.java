package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.CreateSelectionProcessUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.DeleteSelectionProcessUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.RetrieveSelectionProcessUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.UpdateSelectionProcessUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelectionProcessService implements CreateSelectionProcessUseCase, DeleteSelectionProcessUseCase, RetrieveSelectionProcessUseCase, UpdateSelectionProcessUseCase {
    private final CreateSelectionProcessUseCase createSelectionProcessUseCase;
    private final DeleteSelectionProcessUseCase deleteSelectionProcessUseCase;
    private final RetrieveSelectionProcessUseCase retrieveSelectionProcessUseCase;
    private final UpdateSelectionProcessUseCase updateSelectionProcessUseCase;

    public SelectionProcessService(
            CreateSelectionProcessUseCase createSelectionProcessUseCase,
            DeleteSelectionProcessUseCase deleteSelectionProcessUseCase,
            RetrieveSelectionProcessUseCase retrieveSelectionProcessUseCase,
            UpdateSelectionProcessUseCase updateSelectionProcessUseCase
    ){
        this.createSelectionProcessUseCase = createSelectionProcessUseCase;
        this.deleteSelectionProcessUseCase = deleteSelectionProcessUseCase;
        this.retrieveSelectionProcessUseCase = retrieveSelectionProcessUseCase;
        this.updateSelectionProcessUseCase = updateSelectionProcessUseCase;
    }

    @Override
    public SelectionProcess createSelectionProcess(SelectionProcess selectionProcess) {
        return createSelectionProcessUseCase.createSelectionProcess(selectionProcess);
    }

    @Override
    public boolean deleteSelectionProcess(Long id) {
        return deleteSelectionProcessUseCase.deleteSelectionProcess(id);
    }

    @Override
    public Optional<SelectionProcess> getSelectionProcess(Long id) {
        return retrieveSelectionProcessUseCase.getSelectionProcess(id);
    }

    @Override
    public List<SelectionProcess> getAllSelectionProcess() {
        return retrieveSelectionProcessUseCase.getAllSelectionProcess();
    }

    @Override
    public Optional<SelectionProcess> updateSelectionProcess(Long id, SelectionProcess selectionProcess) {
        return updateSelectionProcessUseCase.updateSelectionProcess(id, selectionProcess);
    }
}
