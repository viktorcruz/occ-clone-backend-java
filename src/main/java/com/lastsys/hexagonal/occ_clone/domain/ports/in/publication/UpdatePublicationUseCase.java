package com.lastsys.hexagonal.occ_clone.domain.ports.in.publication;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;

import java.util.Optional;

public interface UpdatePublicationUseCase {
    Optional<Publication> updatePublication(Long id, Publication publication);
}
