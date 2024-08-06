package com.lastsys.hexagonal.occ_clone.application.usecases.session;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.DeleteSessionUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.session.SessionRepositoryPort;

public class DeleteSessionUseCaseImp implements DeleteSessionUseCase {
    private final SessionRepositoryPort sessionRepositoryPort;

    public DeleteSessionUseCaseImp(SessionRepositoryPort sessionRepositoryPort){
        this.sessionRepositoryPort = sessionRepositoryPort;
    }

    @Override
    public boolean deleteSession(Long id) {
        return sessionRepositoryPort.deleteById(id);
    }
}
