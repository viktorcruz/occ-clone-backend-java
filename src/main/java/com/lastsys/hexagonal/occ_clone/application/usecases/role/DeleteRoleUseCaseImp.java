package com.lastsys.hexagonal.occ_clone.application.usecases.role;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.DeleteRoleUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.role.RoleRepositoryPort;

public class DeleteRoleUseCaseImp implements DeleteRoleUseCase {
   private final RoleRepositoryPort roleRepositoryPort;

    public DeleteRoleUseCaseImp(RoleRepositoryPort roleRepositoryPort) {
        this.roleRepositoryPort = roleRepositoryPort;
    }

    @Override
    public boolean deleteRole(Long id) {
        return roleRepositoryPort.deleteById(id);
    }
}
