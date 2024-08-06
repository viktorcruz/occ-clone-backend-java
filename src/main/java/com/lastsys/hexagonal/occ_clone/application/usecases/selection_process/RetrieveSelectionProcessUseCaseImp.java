package com.lastsys.hexagonal.occ_clone.application.usecases.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process.RetrieveSelectionProcessUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.selection_process.SelectionProcessRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveSelectionProcessUseCaseImp implements RetrieveSelectionProcessUseCase {
    private final SelectionProcessRepositoryPort selectionProcessRepositoryPort;

    public RetrieveSelectionProcessUseCaseImp(SelectionProcessRepositoryPort selectionProcessRepositoryPort){
        this.selectionProcessRepositoryPort = selectionProcessRepositoryPort;
    }

    @Override
    public Optional<SelectionProcess> getSelectionProcess(Long id) {
        return selectionProcessRepositoryPort.findById(id);
    }

    @Override
    public List<SelectionProcess> getAllSelectionProcess() {
        return selectionProcessRepositoryPort.findAll();
    }
}
