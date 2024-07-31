package com.lastsys.hexagonal.occ_clone.domain.ports.in.user;

import com.lastsys.hexagonal.occ_clone.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface RetrieveUserUseCase {
    Optional<User> getUser(Long id);
    List<User> getAllUsers();
}
