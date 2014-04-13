package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Categorie;

public interface CategorieRepository 
   extends CrudRepository<Categorie, Long>, JpaRepository<Categorie, Long> {
}