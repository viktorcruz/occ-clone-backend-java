package com.lastsys.hexagonal.occ_clone.domain.ports.out.role;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepositoryPort {
    Role save(Role role);
    Optional<Role> findById(Long id);
    List<Role> findAll();
    Optional<Role> update(Role role);
    boolean deleteById(Long id);
}
