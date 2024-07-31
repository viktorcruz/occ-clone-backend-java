package com.lastsys.hexagonal.occ_clone.domain.ports.in.user;

import com.lastsys.hexagonal.occ_clone.domain.models.User;

public interface CreateUserUseCase {
    User createUser(User user);
}
