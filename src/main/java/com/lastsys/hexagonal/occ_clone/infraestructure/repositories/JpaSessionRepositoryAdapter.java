package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Session;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.session.SessionRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.SessionEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaSessionRepositoryAdapter implements SessionRepositoryPort {
    private final JpaSessionRepository jpaSessionRepository;
    private final JpaUserRepository jpaUserRepository;

    public JpaSessionRepositoryAdapter(
            JpaSessionRepository jpaSessionRepository,
            JpaUserRepository jpaUserRepository
    ){
        this.jpaSessionRepository = jpaSessionRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public Session save(Session session) {
        UserEntity userEntity = jpaUserRepository.findById(session.getIdUser())
                .orElseThrow(()-> new RuntimeException("User not found"));
        SessionEntity sessionEntity = SessionEntity.fromDomainModel(session, userEntity);
        SessionEntity saveSessionEntity = jpaSessionRepository.save(sessionEntity);
        return saveSessionEntity.toDomainModel();
    }

    @Override
    public Optional<Session> findById(Long id) {
        return jpaSessionRepository.findById(id)
                .map(SessionEntity::toDomainModel);
    }

    @Override
    public List<Session> findAll() {
        return jpaSessionRepository.findAll()
                .stream().map(SessionEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Session> update(Session session) {
        if(jpaSessionRepository.existsById(session.getId())){
            UserEntity userEntity = jpaUserRepository.findById(session.getIdUser())
                    .orElseThrow(()-> new RuntimeException("User not found"));
            SessionEntity sessionEntity = SessionEntity.fromDomainModel(session, userEntity);
            SessionEntity updateSessionEntity = jpaSessionRepository.save(sessionEntity);
            return Optional.of(updateSessionEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaSessionRepository.existsById(id)){
            jpaSessionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
