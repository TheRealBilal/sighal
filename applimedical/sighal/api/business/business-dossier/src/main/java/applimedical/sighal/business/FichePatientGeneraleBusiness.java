package applimedical.sighal.business;

import java.util.List;

import applimedical.sighal.dto.FichePatientDto;
import applimedical.sighal.dto.FichePatientGeneraleDto;

public interface FichePatientGeneraleBusiness {
	

	List<FichePatientGeneraleDto> getToutesLesFichesPatientGenerale();
	
	FichePatientGeneraleDto getFichePatienGeneraleParId(Long fichePatientgeneraleId);
	
	//List<FichePatientDto> getFichesPatient(String code, String nom);
	
	FichePatientDto sauvegarderFichePatientGenerale(FichePatientGeneraleDto fichePatientGeneraleDto);
	void supprimerFichePatientGenerale(Long ficheFichePatientGeneraleId);

}
