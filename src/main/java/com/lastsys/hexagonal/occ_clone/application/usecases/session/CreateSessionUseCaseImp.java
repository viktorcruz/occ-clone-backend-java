package com.lastsys.hexagonal.occ_clone.application.usecases.session;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.CreateSessionUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.session.SessionRepositoryPort;

public class CreateSessionUseCaseImp implements CreateSessionUseCase {
    private final SessionRepositoryPort sessionRepositoryPort;

    public CreateSessionUseCaseImp(SessionRepositoryPort sessionRepositoryPort){
        this.sessionRepositoryPort = sessionRepositoryPort;
    }
    @Override
    public Session createSession(Session session) {
        return sessionRepositoryPort.save(session);
    }
}
