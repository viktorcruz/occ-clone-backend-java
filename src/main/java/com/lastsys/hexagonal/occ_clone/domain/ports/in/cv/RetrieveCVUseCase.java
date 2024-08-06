package com.lastsys.hexagonal.occ_clone.domain.ports.in.cv;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;

import java.util.List;
import java.util.Optional;

public interface RetrieveCVUseCase {
    Optional<CV> getCV(Long id);
    List<CV> getAllCV();
}
