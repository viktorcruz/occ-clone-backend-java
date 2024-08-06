package com.lastsys.hexagonal.occ_clone.application.usecases.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.CreateSelectionProcessUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.selection_process.SelectionProcessRepositoryPort;

public class CreateSelectionProcessUseCaseImp implements CreateSelectionProcessUseCase  {
    private final SelectionProcessRepositoryPort selectionProcessRepositoryPort;

    public CreateSelectionProcessUseCaseImp(SelectionProcessRepositoryPort selectionProcessRepositoryPort){
        this.selectionProcessRepositoryPort = selectionProcessRepositoryPort;
    }
    @Override
    public SelectionProcess createSelectionProcess(SelectionProcess selectionProcess) {
        return selectionProcessRepositoryPort.save(selectionProcess);
    }
}
