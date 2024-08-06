package com.lastsys.hexagonal.occ_clone.domain.ports.out.session;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;

import java.util.List;
import java.util.Optional;

public interface SessionRepositoryPort {
    Session save(Session session);
    Optional<Session> findById(Long id);
    List<Session> findAll();
    Optional<Session> update(Session session);
    boolean deleteById(Long id);
}
