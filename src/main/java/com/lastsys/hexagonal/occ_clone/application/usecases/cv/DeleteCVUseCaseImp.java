package com.lastsys.hexagonal.occ_clone.application.usecases.cv;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.DeleteCVUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.cv.CVRepositoryPort;

public class DeleteCVUseCaseImp implements DeleteCVUseCase {
    private final CVRepositoryPort cvRepositoryPort;

    public DeleteCVUseCaseImp(CVRepositoryPort cvRepositoryPort){
        this.cvRepositoryPort = cvRepositoryPort;
    }
    @Override
    public boolean deleteCV(Long id) {
        return cvRepositoryPort.deleteById(id);
    }
}
