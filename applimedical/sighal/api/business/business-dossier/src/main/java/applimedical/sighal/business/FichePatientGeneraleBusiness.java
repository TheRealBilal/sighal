package applimedical.sighal.business;

import java.util.List;

import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.FichePatientGenerale;

public interface FichePatientGeneraleBusiness {
	

	List<FichePatientGenerale> getToutesLesFichesPatientGenerale();
	
	FichePatientGenerale getFichePatienGeneraleParId(Long fichePatientgeneraleId);
	
	
	FichePatient sauvegarderFichePatientGenerale(FichePatientGenerale fichePatientGenerale);
	void supprimerFichePatientGenerale(Long ficheFichePatientGeneraleId);

}
