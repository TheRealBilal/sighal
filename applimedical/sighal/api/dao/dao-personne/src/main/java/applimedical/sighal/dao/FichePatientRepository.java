package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.FichePatient;

public interface FichePatientRepository 
   extends CrudRepository<FichePatient, Long>, JpaRepository<FichePatient, Long> {
}