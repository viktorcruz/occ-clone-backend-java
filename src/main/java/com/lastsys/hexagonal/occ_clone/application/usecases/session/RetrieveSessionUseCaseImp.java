package com.lastsys.hexagonal.occ_clone.application.usecases.session;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.RetrieveSessionUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.session.SessionRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveSessionUseCaseImp implements RetrieveSessionUseCase {
    private final SessionRepositoryPort sessionRepositoryPort;

    public RetrieveSessionUseCaseImp(SessionRepositoryPort sessionRepositoryPort){
        this.sessionRepositoryPort = sessionRepositoryPort;
    }

    @Override
    public Optional<Session> getSession(Long id) {
        return sessionRepositoryPort.findById(id);
    }

    @Override
    public List<Session> getAllSession() {
        return sessionRepositoryPort.findAll();
    }
}
