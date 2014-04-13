package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.DossierPatient;

public interface DossierPatientRepository 
   extends CrudRepository<DossierPatient, Long>, JpaRepository<DossierPatient, Long> {
}