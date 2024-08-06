package com.lastsys.hexagonal.occ_clone.domain.ports.out.selection_process;

import com.lastsys.hexagonal.occ_clone.domain.models.SelectionProcess;

import java.util.List;
import java.util.Optional;

public interface SelectionProcessRepositoryPort {
    SelectionProcess save(SelectionProcess selectionProcess);
    Optional<SelectionProcess> findById(Long id);
    List<SelectionProcess> findAll();
    Optional<SelectionProcess> update(SelectionProcess selectionProcess);
    boolean deleteById(Long id);
}
