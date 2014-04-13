package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.SousCategorie;

public interface SousCategorieRepository 
   extends CrudRepository<SousCategorie, Long>, JpaRepository<SousCategorie, Long> {
}