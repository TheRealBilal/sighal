package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Patient;

public interface PatientRepository 
   extends CrudRepository<Patient, Long>, JpaRepository<Patient, Long> {
}