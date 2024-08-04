package com.lastsys.hexagonal.occ_clone.domain.ports.in.publication;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;

import java.util.List;
import java.util.Optional;

public interface RetrievePublicationUseCase {
    Optional<Publication> getPublication(Long id);
    List<Publication> getAllPublications();
}
