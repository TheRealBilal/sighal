package applimedical.sighal.dao;

import java.util.List;

import applimedical.sighal.api.pojo.Patient;

public interface PatientSpecifiqRepository {

	public List<Patient> findListePatient(String code,String nom,Long numDoss,String matricule);
}
