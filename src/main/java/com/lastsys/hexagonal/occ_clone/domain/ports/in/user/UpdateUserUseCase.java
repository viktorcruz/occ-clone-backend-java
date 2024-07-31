package com.lastsys.hexagonal.occ_clone.domain.ports.in.user;

import com.lastsys.hexagonal.occ_clone.domain.models.User;

import java.util.Optional;

public interface UpdateUserUseCase {
    Optional<User> updateUser(Long id, User updatedUser);
}
