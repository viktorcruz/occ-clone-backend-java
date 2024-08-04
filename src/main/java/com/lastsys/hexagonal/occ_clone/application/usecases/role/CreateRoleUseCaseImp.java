package com.lastsys.hexagonal.occ_clone.application.usecases.role;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.CreateRoleUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.role.RoleRepositoryPort;

public class CreateRoleUseCaseImp implements CreateRoleUseCase {
    private final RoleRepositoryPort roleRepositoryPort;

    public CreateRoleUseCaseImp(RoleRepositoryPort roleRepositoryPort) {
        this.roleRepositoryPort = roleRepositoryPort;
    }

    @Override
    public Role createRole(Role role) {
        return roleRepositoryPort.save(role);
    }
}
