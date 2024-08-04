package com.lastsys.hexagonal.occ_clone.domain.ports.out.publication;

import com.lastsys.hexagonal.occ_clone.domain.models.Publication;

import java.util.List;
import java.util.Optional;

public interface PublicationRepositoryPort {
    Publication save(Publication publication);
    Optional<Publication> findById(Long id);
    List<Publication> findAll();
    Optional<Publication> update(Publication publication);
    boolean deleteById(Long id);
}
