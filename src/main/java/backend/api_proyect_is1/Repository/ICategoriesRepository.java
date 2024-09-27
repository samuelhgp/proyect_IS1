package backend.api_proyect_is1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.api_proyect_is1.Model.CategoriesModel;

public interface ICategoriesRepository extends  JpaRepository<CategoriesModel, String> {

    
}
