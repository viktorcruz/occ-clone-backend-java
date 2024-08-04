package com.lastsys.hexagonal.occ_clone.application.usecases.publication;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.UpdatePublicationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.publication.PublicationRepositoryPort;

import java.util.Optional;

public class UpdatePublicationUseCaseImp implements UpdatePublicationUseCase {
    private final PublicationRepositoryPort publicationRepositoryPort;

    public UpdatePublicationUseCaseImp(PublicationRepositoryPort publicationRepositoryPort){
        this.publicationRepositoryPort = publicationRepositoryPort;
    }
    @Override
    public Optional<Publication> updatePublication(Long id, Publication publication) {
        return publicationRepositoryPort.update(publication);
    }
}
