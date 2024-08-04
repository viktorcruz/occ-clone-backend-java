package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Role;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.role.RoleRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.RoleEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaRoleRepositoryAdapter implements RoleRepositoryPort {
    private final JpaRoleRepository jpaRoleRepository;

    public JpaRoleRepositoryAdapter(JpaRoleRepository jpaRoleRepository){
        this.jpaRoleRepository = jpaRoleRepository;
    }

    @Override
    public Role save(Role role) {
        RoleEntity roleEntity = RoleEntity.fromDomainModel(role);
        RoleEntity saveRoleEntity = jpaRoleRepository.save(roleEntity);
        return saveRoleEntity.toDomainModel();
    }

    @Override
    public Optional<Role> findById(Long id) {
        return jpaRoleRepository.findById(id)
                .map(RoleEntity::toDomainModel);
    }

    @Override
    public List<Role> findAll() {
        return jpaRoleRepository.findAll()
                .stream().map(RoleEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Role> update(Role role) {
        if(jpaRoleRepository.existsById(role.getId())){
            RoleEntity roleEntity = RoleEntity.fromDomainModel(role);
            RoleEntity updateRoleEntity = jpaRoleRepository.save(roleEntity);
            return Optional.of(updateRoleEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaRoleRepository.existsById(id)){
            jpaRoleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
