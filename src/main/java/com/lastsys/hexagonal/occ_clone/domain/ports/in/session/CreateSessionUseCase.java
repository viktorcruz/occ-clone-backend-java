package com.lastsys.hexagonal.occ_clone.domain.ports.in.session;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;

public interface CreateSessionUseCase {
    Session createSession(Session session);
}
