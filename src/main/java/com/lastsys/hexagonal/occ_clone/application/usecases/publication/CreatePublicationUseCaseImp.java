package com.lastsys.hexagonal.occ_clone.application.usecases.publication;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.CreatePublicationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.publication.PublicationRepositoryPort;

public class CreatePublicationUseCaseImp implements CreatePublicationUseCase {
    private final PublicationRepositoryPort publicationRepositoryPort;

    public CreatePublicationUseCaseImp(PublicationRepositoryPort publicationRepositoryPort) {
        this.publicationRepositoryPort = publicationRepositoryPort;
    }

    @Override
    public Publication createPublication(Publication publication) {
        return publicationRepositoryPort.save(publication);
    }
}
