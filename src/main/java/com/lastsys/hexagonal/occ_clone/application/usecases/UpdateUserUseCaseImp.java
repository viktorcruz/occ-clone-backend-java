package com.lastsys.hexagonal.occ_clone.application.usecases;

import com.lastsys.hexagonal.occ_clone.domain.models.User;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.UpdateUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.user.UserRepositoryPort;

import java.util.Optional;

public class UpdateUserUseCaseImp implements UpdateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UpdateUserUseCaseImp(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<User> updateUser(Long id, User updatedUser) {
        return Optional.empty();
    }
}
