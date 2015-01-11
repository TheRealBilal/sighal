package applimedical.sighal.web.ressources;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Controller;

import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.PatientDto;

@Controller("dossPatiRechercher")
@ManagedBean
@ViewScoped
public class RecherchePatientDossier {

	private PatientDto patient = new PatientDto();
	private DossierPatientDto dossier = new DossierPatientDto();
	
	
	
	 public String  startPage() {
		 setPatient(new PatientDto());
		 setDossier(new DossierPatientDto());
		 return "recherchePatientDossier";
	   }
	 
	 
	
	 public String rechercher() {
		 
		 
	      return "recherchePatientDossier";
	   }


	 
	 
	 
	/**
	 * @return the patient
	 */
	public PatientDto getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(PatientDto patient) {
		this.patient = patient;
	}

	/**
	 * @return the dossier
	 */
	public DossierPatientDto getDossier() {
		return dossier;
	}

	/**
	 * @param dossier the dossier to set
	 */
	public void setDossier(DossierPatientDto dossier) {
		this.dossier = dossier;
	}
}
