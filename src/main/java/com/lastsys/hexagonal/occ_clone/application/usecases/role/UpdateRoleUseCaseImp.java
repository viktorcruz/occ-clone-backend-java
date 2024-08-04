package com.lastsys.hexagonal.occ_clone.application.usecases.role;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.UpdateRoleUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.role.RoleRepositoryPort;

import java.util.Optional;

public class UpdateRoleUseCaseImp implements UpdateRoleUseCase {
    private final RoleRepositoryPort roleRepositoryPort;

    public UpdateRoleUseCaseImp(RoleRepositoryPort roleRepositoryPort){
        this.roleRepositoryPort = roleRepositoryPort;
    }

    @Override
    public Optional<Role> updateRole(Long id, Role updateRole) {
        return roleRepositoryPort.update(updateRole);
    }
}
