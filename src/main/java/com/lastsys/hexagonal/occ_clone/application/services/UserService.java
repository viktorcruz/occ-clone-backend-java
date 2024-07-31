package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.User;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.CreateUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.DeleteUserCaseUse;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.RetrieveUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.UpdateUserUseCase;

import java.util.List;
import java.util.Optional;

public class UserService implements CreateUserUseCase, DeleteUserCaseUse, RetrieveUserUseCase, UpdateUserUseCase {
    private final CreateUserUseCase createUserUseCase;
    private final DeleteUserCaseUse deleteUserCaseUse;
    private final RetrieveUserUseCase retrieveUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;

    public UserService(
            CreateUserUseCase createUserUseCase,
            DeleteUserCaseUse deleteUserCaseUse,
            RetrieveUserUseCase retrieveUserUseCase,
            UpdateUserUseCase updateUserUseCase
    ) {
        this.createUserUseCase = createUserUseCase;
        this.deleteUserCaseUse = deleteUserCaseUse;
        this.retrieveUserUseCase = retrieveUserUseCase;
        this.updateUserUseCase = updateUserUseCase;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        return false;
    }

    @Override
    public Optional<User> getUser(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public Optional<User> updateUser(Long id, User updatedUser) {
        return Optional.empty();
    }
}
