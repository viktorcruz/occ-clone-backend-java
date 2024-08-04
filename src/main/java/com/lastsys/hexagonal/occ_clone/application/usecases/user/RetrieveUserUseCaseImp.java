package com.lastsys.hexagonal.occ_clone.application.usecases.user;

import com.lastsys.hexagonal.occ_clone.domain.models.User;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.RetrieveUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.user.UserRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveUserUseCaseImp implements RetrieveUserUseCase {
    private final UserRepositoryPort userRepositoryPort;

    public RetrieveUserUseCaseImp(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepositoryPort.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoryPort.findAll();
    }
}
