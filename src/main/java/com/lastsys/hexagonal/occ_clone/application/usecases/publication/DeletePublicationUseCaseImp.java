package com.lastsys.hexagonal.occ_clone.application.usecases.publication;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.publication.DeletePublicationUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.publication.PublicationRepositoryPort;

public class DeletePublicationUseCaseImp implements DeletePublicationUseCase {
    private final PublicationRepositoryPort publicationRepositoryPort;

    public DeletePublicationUseCaseImp(PublicationRepositoryPort publicationRepositoryPort) {
        this.publicationRepositoryPort = publicationRepositoryPort;
    }


    @Override
    public boolean deletePublication(Long id) {
        return publicationRepositoryPort.deleteById(id);
    }
}
