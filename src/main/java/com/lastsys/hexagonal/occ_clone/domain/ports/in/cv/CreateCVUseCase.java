package com.lastsys.hexagonal.occ_clone.domain.ports.in.cv;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;

public interface CreateCVUseCase {
    CV createCV(CV cv);
}
