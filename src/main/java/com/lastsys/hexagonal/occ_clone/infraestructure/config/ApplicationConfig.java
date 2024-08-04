package com.lastsys.hexagonal.occ_clone.infraestructure.config;

import com.lastsys.hexagonal.occ_clone.application.services.PublicationService;
import com.lastsys.hexagonal.occ_clone.application.services.RoleService;
import com.lastsys.hexagonal.occ_clone.application.services.UserService;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.CreatePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.DeletePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.RetrievePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.UpdatePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.CreateRoleUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.DeleteRoleUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.RetrieveRoleCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.UpdateRoleUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.CreateUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.DeleteUserCaseUseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.RetrieveUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.UpdateUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.publication.PublicationRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.role.RoleRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.user.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserService userService(
            UserRepositoryPort userRepositoryPort
    ){
        return new UserService(
                new CreateUserUseCaseImp(userRepositoryPort),
                new DeleteUserCaseUseImp(userRepositoryPort),
                new RetrieveUserUseCaseImp(userRepositoryPort),
                new UpdateUserUseCaseImp(userRepositoryPort)
        );
    }

    @Bean
    public PublicationService publicationService(
            PublicationRepositoryPort publicationRepositoryPort
    ){
        return new PublicationService(
                new CreatePublicationUseCaseImp(publicationRepositoryPort),
                new DeletePublicationUseCaseImp(publicationRepositoryPort),
                new RetrievePublicationUseCaseImp(publicationRepositoryPort),
                new UpdatePublicationUseCaseImp(publicationRepositoryPort)
        );
    }

    @Bean
    public RoleService roleService(
            RoleRepositoryPort roleRepositoryPort
    ){
        return new RoleService(
                new CreateRoleUseCaseImp(roleRepositoryPort),
                new DeleteRoleUseCaseImp(roleRepositoryPort),
                new RetrieveRoleCaseImp(roleRepositoryPort),
                new UpdateRoleUseCaseImp(roleRepositoryPort)
        );
    }
}
