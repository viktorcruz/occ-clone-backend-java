package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.CreatePublicationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.DeletePublicationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.RetrievePublicationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.UpdatePublicationUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicationService implements CreatePublicationUseCase, DeletePublicationUseCase, RetrievePublicationUseCase, UpdatePublicationUseCase {
    private final CreatePublicationUseCase createPublicationUseCase;
    private final DeletePublicationUseCase deletePublicationUseCase;
    private final RetrievePublicationUseCase retrievePublicationUseCase;
    private final UpdatePublicationUseCase updatePublicationUseCase;

    public PublicationService(
            CreatePublicationUseCase createPublicationUseCase,
            DeletePublicationUseCase deletePublicationUseCase,
            RetrievePublicationUseCase retrievePublicationUseCase,
            UpdatePublicationUseCase updatePublicationUseCase
    ){
        this.createPublicationUseCase = createPublicationUseCase;
        this.deletePublicationUseCase = deletePublicationUseCase;
        this.retrievePublicationUseCase = retrievePublicationUseCase;
        this.updatePublicationUseCase = updatePublicationUseCase;
    }

    @Override
    public Publication createPublication(Publication publication) {
        return createPublicationUseCase.createPublication(publication);
    }

    @Override
    public boolean deletePublication(Long id) {
        return deletePublicationUseCase.deletePublication(id);
    }

    @Override
    public Optional<Publication> getPublication(Long id) {
        return retrievePublicationUseCase.getPublication(id);
    }

    @Override
    public List<Publication> getAllPublications() {
        return retrievePublicationUseCase.getAllPublications();
    }

    @Override
    public Optional<Publication> updatePublication(Long id, Publication publication) {
        return updatePublicationUseCase.updatePublication(id, publication);
    }
}
