package com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;

public interface CreateSelectionProcessUseCase {
    SelectionProcess createSelectionProcess(SelectionProcess selectionProcess);
}
