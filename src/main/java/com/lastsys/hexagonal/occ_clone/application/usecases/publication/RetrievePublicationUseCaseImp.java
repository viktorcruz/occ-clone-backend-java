package com.lastsys.hexagonal.occ_clone.application.usecases.publication;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.RetrievePublicationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.publication.PublicationRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrievePublicationUseCaseImp implements RetrievePublicationUseCase {
    private final PublicationRepositoryPort publicationRepositoryPort;

    public RetrievePublicationUseCaseImp(PublicationRepositoryPort publicationRepositoryPort){
        this.publicationRepositoryPort = publicationRepositoryPort;
    }
    @Override
    public Optional<Publication> getPublication(Long id) {
        return publicationRepositoryPort.findById(id);
    }

    @Override
    public List<Publication> getAllPublications() {
        return publicationRepositoryPort.findAll();
    }
}
