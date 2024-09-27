package backend.api_proyect_is1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.api_proyect_is1.Model.UsersModel;

public interface IUsersRepository extends JpaRepository<UsersModel, String>{
    
}
