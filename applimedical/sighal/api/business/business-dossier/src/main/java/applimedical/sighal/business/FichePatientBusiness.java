package applimedical.sighal.business;

import java.util.List;

import applimedical.sighal.dto.FichePatientDto;

public interface FichePatientBusiness {
	
	
	List<FichePatientDto> getToutesLesFichesPatient();
	
	FichePatientDto getFichePatienParId(Long fichePatientId);
	
	//List<FichePatientDto> getFichesPatient(String code, String nom);
	
	FichePatientDto sauvegarderFichePatient(FichePatientDto fichePatientDto);
	void supprimerSalle(Long fichePatientId);
}
