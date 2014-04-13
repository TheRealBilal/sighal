package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Fonction;

public interface FonctionRepository 
   extends CrudRepository<Fonction, Long>, JpaRepository<Fonction, Long> {
}