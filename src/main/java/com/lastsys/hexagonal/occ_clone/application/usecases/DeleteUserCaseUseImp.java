package com.lastsys.hexagonal.occ_clone.application.usecases;

import com.lastsys.hexagonal.occ_clone.domain.ports.in.user.DeleteUserCaseUse;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.user.UserRepositoryPort;

public class DeleteUserCaseUseImp implements DeleteUserCaseUse {
    private final UserRepositoryPort userRepositoryPort;

    public DeleteUserCaseUseImp(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public boolean deleteUser(Long id) {
        return false;
    }
}
