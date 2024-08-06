package com.lastsys.hexagonal.occ_clone.domain.ports.in.cv;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;

import java.util.Optional;

public interface UpdateCVUseCase {
    Optional<CV> updateCV(Long id, CV cv);
}
