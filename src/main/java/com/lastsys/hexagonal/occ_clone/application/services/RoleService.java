package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.CreateRoleUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.DeleteRoleUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.RetrieveRoleUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.role.UpdateRoleUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements CreateRoleUseCase, DeleteRoleUseCase, RetrieveRoleUseCase, UpdateRoleUseCase {

    private final CreateRoleUseCase createRoleUseCase;
    private final DeleteRoleUseCase deleteRoleUseCase;
    private final RetrieveRoleUseCase retrieveRoleUseCase;
    private final UpdateRoleUseCase updateRoleUseCase;

    public RoleService(
            CreateRoleUseCase createRoleUseCase,
            DeleteRoleUseCase deleteRoleUseCase,
            RetrieveRoleUseCase retrieveRoleUseCase,
            UpdateRoleUseCase updateRoleUseCase
    ){
    this.createRoleUseCase = createRoleUseCase;
    this.deleteRoleUseCase = deleteRoleUseCase;
    this.retrieveRoleUseCase = retrieveRoleUseCase;
    this.updateRoleUseCase = updateRoleUseCase;

    }


    @Override
    public Role createRole(Role role) {
        return createRoleUseCase.createRole(role);
    }

    @Override
    public boolean deleteRole(Long id) {
        return deleteRoleUseCase.deleteRole(id);
    }

    @Override
    public Optional<Role> getRole(Long id) {
        return retrieveRoleUseCase.getRole(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return retrieveRoleUseCase.getAllRoles();
    }

    @Override
    public Optional<Role> updateRole(Long id, Role updateRole) {
        return updateRoleUseCase.updateRole(id, updateRole);
    }
}
