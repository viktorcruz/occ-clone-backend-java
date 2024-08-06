package com.lastsys.hexagonal.occ_clone.infraestructure.config;

import com.lastsys.hexagonal.occ_clone.application.services.*;
import com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history.CreateApplicantHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history.DeleteApplicantHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history.RetrieveApplicantHistoryUseCoseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.applicant_history.UpdateApplicantHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.company_history.CreateCompanyHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.company_history.DeleteCompanyHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.company_history.RetrieveCompanyHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.company_history.UpdateCompanyHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.cv.CreateCVUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.cv.DeleteCVUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.cv.RetrieveCVUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.cv.UpdateCVUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.education.CreateEducationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.education.DeleteEducationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.education.RetrieveEducationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.education.UpdateEducationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.employee_history.CreateEmployeeHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.employee_history.DeleteEmployeeHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.employee_history.RetrieveEmployeeHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.employee_history.UpdateEmployeeHistoryUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.experience.CreateExperienceUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.experience.DeleteExperienceUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.experience.RetrieveExperienceUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.experience.UpdateExperienceUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.favorite.CreateFavoriteUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.favorite.DeleteFavoriteUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.favorite.RetrieveFavoriteUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.favorite.UpdateFavoriteUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.CreatePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.DeletePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.RetrievePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.publication.UpdatePublicationUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.record.CreateRecordUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.record.DeleteRecordUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.record.RetrieveRecordUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.record.UpdateRecordUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.CreateRoleUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.DeleteRoleUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.RetrieveRoleCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.role.UpdateRoleUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.selection_process.CreateSelectionProcessUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.selection_process.DeleteSelectionProcessUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.selection_process.RetrieveSelectionProcessUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.selection_process.UpdateSelectionProcessUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.session.CreateSessionUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.session.DeleteSessionUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.session.RetrieveSessionUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.session.UpdateSessionUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.skill.CreateSkillUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.skill.DeleteSkillUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.skill.RetrieveSkillUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.skill.UpdateSkillUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.CreateUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.DeleteUserCaseUseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.RetrieveUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.application.usecases.user.UpdateUserUseCaseImp;
import com.lastsys.hexagonal.occ_clone.domain.models.CV;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.CreateExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.experience.DeleteExperienceUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.applicant_history.ApplicantHistoryRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.company_history.CompanyHistoryRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.cv.CVRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.education.EducationRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.employee_history.EmployeeHistoryRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.experience.ExperienceRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.favorite.FavoriteRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.publication.PublicationRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.record.RecordRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.role.RoleRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.selection_process.SelectionProcessRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.session.SessionRepositoryPort;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.skill.SkillRepositoryPort;
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

    @Bean
    public ApplicantHistoryService applicantHistoryService(
            ApplicantHistoryRepositoryPort applicantHistoryRepositoryPort
    ){
        return new ApplicantHistoryService(
                new CreateApplicantHistoryUseCaseImp(applicantHistoryRepositoryPort),
                new DeleteApplicantHistoryUseCaseImp(applicantHistoryRepositoryPort),
                new RetrieveApplicantHistoryUseCoseImp(applicantHistoryRepositoryPort),
                new UpdateApplicantHistoryUseCaseImp(applicantHistoryRepositoryPort)
        );
    }

    @Bean
    public CompanyHistoryService companyHistoryService(
            CompanyHistoryRepositoryPort companyHistoryRepositoryPort
    ){
        return new CompanyHistoryService(
                new CreateCompanyHistoryUseCaseImp(companyHistoryRepositoryPort),
                new DeleteCompanyHistoryUseCaseImp(companyHistoryRepositoryPort),
                new RetrieveCompanyHistoryUseCaseImp(companyHistoryRepositoryPort),
                new UpdateCompanyHistoryUseCaseImp(companyHistoryRepositoryPort)
        );
    }

    @Bean
    public EmployeeHistoryService employeeHistoryService(
            EmployeeHistoryRepositoryPort employeeHistoryRepositoryPort
    ){
        return new EmployeeHistoryService(
                new CreateEmployeeHistoryUseCaseImp(employeeHistoryRepositoryPort),
                new DeleteEmployeeHistoryUseCaseImp(employeeHistoryRepositoryPort),
                new RetrieveEmployeeHistoryUseCaseImp(employeeHistoryRepositoryPort),
                new UpdateEmployeeHistoryUseCaseImp(employeeHistoryRepositoryPort)
        );
    }

    @Bean
    public CVService cvService(CVRepositoryPort cvRepositoryPort){
        return new CVService(
                new CreateCVUseCaseImp(cvRepositoryPort),
                new DeleteCVUseCaseImp(cvRepositoryPort),
                new RetrieveCVUseCaseImp(cvRepositoryPort),
                new UpdateCVUseCaseImp(cvRepositoryPort)
        );
    }

    @Bean
    public EducationService educationService(EducationRepositoryPort educationRepositoryPort){
        return new EducationService(
                new CreateEducationUseCaseImp(educationRepositoryPort),
                new DeleteEducationUseCaseImp(educationRepositoryPort),
                new RetrieveEducationUseCaseImp(educationRepositoryPort),
                new UpdateEducationUseCaseImp(educationRepositoryPort)
        );
    }

    @Bean
    public ExperienceService experienceService(ExperienceRepositoryPort experienceRepositoryPort){
        return new ExperienceService(
                new CreateExperienceUseCaseImp(experienceRepositoryPort),
                new DeleteExperienceUseCaseImp(experienceRepositoryPort),
                new RetrieveExperienceUseCaseImp(experienceRepositoryPort),
                new UpdateExperienceUseCaseImp(experienceRepositoryPort)
        );
    }

    @Bean
    public FavoriteService favoriteService(FavoriteRepositoryPort favoriteRepositoryPort){
        return new FavoriteService(
                new CreateFavoriteUseCaseImp(favoriteRepositoryPort),
                new DeleteFavoriteUseCaseImp(favoriteRepositoryPort),
                new RetrieveFavoriteUseCaseImp(favoriteRepositoryPort),
                new UpdateFavoriteUseCaseImp(favoriteRepositoryPort)
        );
    }

    @Bean
    public RecordService recordService(RecordRepositoryPort recordRepositoryPort){
        return new RecordService(
                new CreateRecordUseCaseImp(recordRepositoryPort),
                new DeleteRecordUseCaseImp(recordRepositoryPort),
                new RetrieveRecordUseCaseImp(recordRepositoryPort),
                new UpdateRecordUseCaseImp(recordRepositoryPort)
        );
    }

    @Bean
    public SelectionProcessService selectionProcessService(SelectionProcessRepositoryPort selectionProcessRepositoryPort){
        return new SelectionProcessService(
                new CreateSelectionProcessUseCaseImp(selectionProcessRepositoryPort),
                new DeleteSelectionProcessUseCaseImp(selectionProcessRepositoryPort),
                new RetrieveSelectionProcessUseCaseImp(selectionProcessRepositoryPort),
                new UpdateSelectionProcessUseCaseImp(selectionProcessRepositoryPort)
        );
    }

    @Bean
    public SessionService sessionService(SessionRepositoryPort sessionRepositoryPort){
        return new SessionService(
                new CreateSessionUseCaseImp(sessionRepositoryPort),
                new DeleteSessionUseCaseImp(sessionRepositoryPort),
                new RetrieveSessionUseCaseImp(sessionRepositoryPort),
                new UpdateSessionUseCaseImp(sessionRepositoryPort)
        );
    }

    @Bean
    public SkillService skillService(SkillRepositoryPort skillRepositoryPort){
        return new SkillService(
                new CreateSkillUseCaseImp(skillRepositoryPort),
                new DeleteSkillUseCaseImp(skillRepositoryPort),
                new RetrieveSkillUseCaseImp(skillRepositoryPort),
                new UpdateSkillUseCaseImp(skillRepositoryPort)
        );
    }
}
