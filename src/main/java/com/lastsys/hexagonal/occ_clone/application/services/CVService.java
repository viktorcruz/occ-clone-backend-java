package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.CreateCVUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.DeleteCVUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.RetrieveCVUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.cv.UpdateCVUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CVService implements CreateCVUseCase, DeleteCVUseCase, RetrieveCVUseCase, UpdateCVUseCase {
    private final CreateCVUseCase createCVUseCase;
    private final DeleteCVUseCase deleteCVUseCase;
    private final RetrieveCVUseCase retrieveCVUseCase;
    private final UpdateCVUseCase updateCVUseCase;

    public CVService(
            CreateCVUseCase createCVUseCase,
            DeleteCVUseCase deleteCVUseCase,
            RetrieveCVUseCase retrieveCVUseCase,
            UpdateCVUseCase updateCVUseCase
    ){
        this.createCVUseCase = createCVUseCase;
        this.deleteCVUseCase = deleteCVUseCase;
        this.retrieveCVUseCase = retrieveCVUseCase;
        this.updateCVUseCase = updateCVUseCase;
    }

    @Override
    public CV createCV(CV cv) {
        return createCVUseCase.createCV(cv);
    }

    @Override
    public boolean deleteCV(Long id) {
        return deleteCVUseCase.deleteCV(id);
    }

    @Override
    public Optional<CV> getCV(Long id) {
        return retrieveCVUseCase.getCV(id);
    }

    @Override
    public List<CV> getAllCV() {
        return retrieveCVUseCase.getAllCV();
    }

    @Override
    public Optional<CV> updateCV(Long id, CV cv) {
        return updateCVUseCase.updateCV(id, cv);
    }
}
