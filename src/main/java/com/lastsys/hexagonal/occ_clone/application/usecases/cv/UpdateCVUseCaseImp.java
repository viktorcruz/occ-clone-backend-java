package com.lastsys.hexagonal.occ_clone.application.usecases.cv;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.UpdateCVUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.cv.CVRepositoryPort;

import java.util.Optional;

public class UpdateCVUseCaseImp implements UpdateCVUseCase {
    private final CVRepositoryPort cvRepositoryPort;

    public UpdateCVUseCaseImp(CVRepositoryPort cvRepositoryPort){
        this.cvRepositoryPort = cvRepositoryPort;
    }
    @Override
    public Optional<CV> updateCV(Long id, CV cv) {
        return cvRepositoryPort.update(cv);
    }
}
