package com.lastsys.hexagonal.occ_clone.domain.ports.out.cv;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;

import java.util.List;
import java.util.Optional;

public interface CVRepositoryPort {
    CV save(CV cv);
    Optional<CV> findById(Long id);
    List<CV> findAll();
    Optional<CV> update(CV cv);
    boolean deleteById(Long id);
}

