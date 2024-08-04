package com.lastsys.hexagonal.occ_clone.domain.ports.in.publication;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;

public interface CreatePublicationUseCase {
    Publication createPublication(Publication publication);
}
