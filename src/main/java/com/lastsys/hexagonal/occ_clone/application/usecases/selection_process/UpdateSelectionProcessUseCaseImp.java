package com.lastsys.hexagonal.occ_clone.application.usecases.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.UpdateSelectionProcessUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.selection_process.SelectionProcessRepositoryPort;

import java.util.Optional;

public class UpdateSelectionProcessUseCaseImp implements UpdateSelectionProcessUseCase {
    private final SelectionProcessRepositoryPort selectionProcessRepositoryPort;

    public UpdateSelectionProcessUseCaseImp(SelectionProcessRepositoryPort selectionProcessRepositoryPort){
        this.selectionProcessRepositoryPort = selectionProcessRepositoryPort;
    }

    @Override
    public Optional<SelectionProcess> updateSelectionProcess(Long id, SelectionProcess selectionProcess) {
        return selectionProcessRepositoryPort.update(selectionProcess);
    }
}
