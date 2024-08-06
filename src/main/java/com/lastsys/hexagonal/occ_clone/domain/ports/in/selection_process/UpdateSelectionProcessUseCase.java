package com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;

import java.util.Optional;

public interface UpdateSelectionProcessUseCase {
    Optional<SelectionProcess> updateSelectionProcess(Long id, SelectionProcess selectionProcess);
}
