package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.User;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.CreateUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.DeleteUserCaseUse;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.RetrieveUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.UpdateUserUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
        return createUserUseCase.createUser(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        return deleteUserCaseUse.deleteUser(id);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return retrieveUserUseCase.getUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return retrieveUserUseCase.getAllUsers();
    }

    @Override
    public Optional<User> updateUser(Long id, User updatedUser) {
        return updateUserUseCase.updateUser(id, updatedUser);
    }
}
