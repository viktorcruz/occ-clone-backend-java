package com.lastsys.hexagonal.occ_clone.domain.ports.in.role;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;

import java.util.List;
import java.util.Optional;

public interface RetrieveRoleUseCase {
    Optional<Role> getRole(Long id);
    List<Role> getAllRoles();
}
