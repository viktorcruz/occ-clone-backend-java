package com.lastsys.hexagonal.occ_clone.domain.ports.in.session;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;

import java.util.Optional;

public interface UpdateSessionUseCase {
    Optional<Session> updateSession(Long id, Session session);
}
