package com.lastsys.hexagonal.occ_clone.domain.ports.in.session;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;

import java.util.List;
import java.util.Optional;

public interface RetrieveSessionUseCase {
    Optional<Session> getSession(Long id);
    List<Session> getAllSession();
}
