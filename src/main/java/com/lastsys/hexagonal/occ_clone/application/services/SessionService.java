package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.CreateSessionUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.DeleteSessionUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.RetrieveSessionUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.session.UpdateSessionUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService implements CreateSessionUseCase, DeleteSessionUseCase, RetrieveSessionUseCase, UpdateSessionUseCase {
    private final CreateSessionUseCase createSessionUseCase;
    private final DeleteSessionUseCase deleteSessionUseCase;
    private final RetrieveSessionUseCase retrieveSessionUseCase;
    private final UpdateSessionUseCase updateSessionUseCase;


    public SessionService(
            CreateSessionUseCase createSessionUseCase,
            DeleteSessionUseCase deleteSessionUseCase,
            RetrieveSessionUseCase retrieveSessionUseCase,
            UpdateSessionUseCase updateSessionUseCase
    ){
        this.createSessionUseCase = createSessionUseCase;
        this.deleteSessionUseCase = deleteSessionUseCase;
        this.retrieveSessionUseCase = retrieveSessionUseCase;
        this.updateSessionUseCase = updateSessionUseCase;
    }

    @Override
    public Session createSession(Session session) {
        return createSessionUseCase.createSession(session);
    }

    @Override
    public boolean deleteSession(Long id) {
        return deleteSessionUseCase.deleteSession(id);
    }

    @Override
    public Optional<Session> getSession(Long id) {
        return retrieveSessionUseCase.getSession(id);
    }

    @Override
    public List<Session> getAllSession() {
        return retrieveSessionUseCase.getAllSession();
    }

    @Override
    public Optional<Session> updateSession(Long id, Session session) {
        return updateSessionUseCase.updateSession(id, session);
    }
}
