package com.lastsys.hexagonal.occ_clone.infraestructure.config;

import com.lastsys.hexagonal.occ_clone.application.services.UserService;
import com.lastsys.hexagonal.occ_clone.application.usecases.CreateUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.DeleteUserCaseUseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.RetrieveUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.UpdateUserUseCaseImp;
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


}
