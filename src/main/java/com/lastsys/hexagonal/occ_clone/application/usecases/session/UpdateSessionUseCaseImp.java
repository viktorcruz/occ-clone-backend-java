package com.lastsys.hexagonal.occ_clone.application.usecases.session;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.UpdateSessionUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.session.SessionRepositoryPort;

import java.util.Optional;

public class UpdateSessionUseCaseImp implements UpdateSessionUseCase {
    private final SessionRepositoryPort sessionRepositoryPort;

    public UpdateSessionUseCaseImp(SessionRepositoryPort sessionRepositoryPort){
        this.sessionRepositoryPort = sessionRepositoryPort;
    }

    @Override
    public Optional<Session> updateSession(Long id, Session session) {
        return sessionRepositoryPort.update(session);
    }
}
