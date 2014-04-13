package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Personne;

public interface PersonneRepository 
   extends CrudRepository<Personne, Long>, JpaRepository<Personne, Long> {
}