package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.FichePatientDentaire;

public interface FichePatientDentaireRepository 
   extends CrudRepository<FichePatientDentaire, Long>, JpaRepository<FichePatientDentaire, Long> {
}