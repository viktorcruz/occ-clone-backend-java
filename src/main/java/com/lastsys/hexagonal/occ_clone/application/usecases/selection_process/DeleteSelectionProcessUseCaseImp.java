package com.lastsys.hexagonal.occ_clone.application.usecases.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.DeleteSelectionProcessUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.selection_process.SelectionProcessRepositoryPort;

public class DeleteSelectionProcessUseCaseImp implements DeleteSelectionProcessUseCase {
    private final SelectionProcessRepositoryPort selectionProcessRepositoryPort;

    public DeleteSelectionProcessUseCaseImp(SelectionProcessRepositoryPort selectionProcessRepositoryPort){
        this.selectionProcessRepositoryPort = selectionProcessRepositoryPort;
    }

    @Override
    public boolean deleteSelectionProcess(Long id) {
        return selectionProcessRepositoryPort.deleteById(id);
    }
}
