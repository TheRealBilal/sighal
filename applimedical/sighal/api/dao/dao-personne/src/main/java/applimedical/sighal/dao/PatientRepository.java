package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import applimedical.sighal.api.pojo.Patient;



public interface PatientRepository 
   extends  JpaRepository<Patient, Long>,PatientSpecifiqRepository {
	
	 
		
}