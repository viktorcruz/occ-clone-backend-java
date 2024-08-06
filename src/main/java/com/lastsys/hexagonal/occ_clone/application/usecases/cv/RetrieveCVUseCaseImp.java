package com.lastsys.hexagonal.occ_clone.application.usecases.cv;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.RetrieveCVUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.cv.CVRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveCVUseCaseImp implements RetrieveCVUseCase {
    private final CVRepositoryPort cvRepositoryPort;

    public RetrieveCVUseCaseImp(CVRepositoryPort cvRepositoryPort){
        this.cvRepositoryPort = cvRepositoryPort;
    }

    @Override
    public Optional<CV> getCV(Long id) {
        return cvRepositoryPort.findById(id);
    }

    @Override
    public List<CV> getAllCV() {
        return cvRepositoryPort.findAll();
    }
}
