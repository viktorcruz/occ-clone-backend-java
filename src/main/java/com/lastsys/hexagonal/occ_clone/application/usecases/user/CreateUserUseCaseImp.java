package com.lastsys.hexagonal.occ_clone.application.usecases.user;

import com.lastsys.hexagonal.occ_clone.domain.models.User;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.CreateUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.user.UserRepositoryPort;

public class CreateUserUseCaseImp implements CreateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public CreateUserUseCaseImp(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.save(user);
    }
}
