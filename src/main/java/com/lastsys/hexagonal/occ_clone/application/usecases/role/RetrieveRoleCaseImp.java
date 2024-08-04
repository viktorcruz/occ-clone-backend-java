package com.lastsys.hexagonal.occ_clone.application.usecases.role;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;
import com.lastsys.hexagonal.occ_clone.domain.models.User;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.RetrieveRoleUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.RetrieveUserUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.role.RoleRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveRoleCaseImp implements RetrieveRoleUseCase {
    private final RoleRepositoryPort roleRepositoryPort;

    public RetrieveRoleCaseImp(RoleRepositoryPort roleRepositoryPort){
        this.roleRepositoryPort = roleRepositoryPort;
    }

    @Override
    public Optional<Role> getRole(Long id) {
        return roleRepositoryPort.findById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepositoryPort.findAll();
    }
}
