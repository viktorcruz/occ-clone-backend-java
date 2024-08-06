package com.lastsys.hexagonal.occ_clone.application.usecases.cv;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.CreateCVUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.cv.CVRepositoryPort;

public class CreateCVUseCaseImp implements CreateCVUseCase {
    private final CVRepositoryPort cvRepositoryPort;

    public CreateCVUseCaseImp(CVRepositoryPort cvRepositoryPort){
        this.cvRepositoryPort = cvRepositoryPort;
    }

    @Override
    public CV createCV(CV cv) {
        return cvRepositoryPort.save(cv);
    }
}
