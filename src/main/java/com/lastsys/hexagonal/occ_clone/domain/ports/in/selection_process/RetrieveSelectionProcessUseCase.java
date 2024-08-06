package com.lastsys.hexagonal.occ_clone.domain.ports.in.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;

import java.util.List;
import java.util.Optional;

public interface RetrieveSelectionProcessUseCase {
    Optional<SelectionProcess> getSelectionProcess(Long id);
    List<SelectionProcess> getAllSelectionProcess();
}
