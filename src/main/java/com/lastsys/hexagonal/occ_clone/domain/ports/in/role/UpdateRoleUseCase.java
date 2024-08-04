package com.lastsys.hexagonal.occ_clone.domain.ports.in.role;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;

import java.util.Optional;

public interface UpdateRoleUseCase {
    Optional<Role> updateRole(Long id, Role updateRole);
}
