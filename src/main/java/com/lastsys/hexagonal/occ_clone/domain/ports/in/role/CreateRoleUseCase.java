package com.lastsys.hexagonal.occ_clone.domain.ports.in.role;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;

public interface CreateRoleUseCase {
    Role createRole(Role role);
}
