package applimedical.sighal.web.ressources;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.criteres.CriteresDossierPatient;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.PatientDto;

@Controller("dossPatiRechercher")
@ManagedBean
@ViewScoped
public class RecherchePatientDossier {
	@Autowired
	private DossierPatientBusiness dossierPatientBusiness ;
	
	private PatientDto patient = new PatientDto();
	private DossierPatientDto dossier = new DossierPatientDto();
	private List<PatientDto> resultList = new ArrayList<PatientDto>();
	CriteresDossierPatient criteres = new CriteresDossierPatient();
	
	

	public String initCreer() {
		setPatient(new PatientDto());
		return "creerDossierPatient";
	}
	
	public String  startPage() {
		 setPatient(new PatientDto());
		 setDossier(new DossierPatientDto());
		 return "recherchePatientDossier";
	   }
	
	 public String rechercher() {
		 
		 
		 resultList=dossierPatientBusiness.recherchePatientDossier(criteres);
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



	/**
	 * @return the resultList
	 */
	public List<PatientDto> getResultList() {
		return resultList;
	}



	/**
	 * @param resultList the resultList to set
	 */
	public void setResultList(List<PatientDto> resultList) {
		this.resultList = resultList;
	}
	
	/**
	 * @return the criteres
	 */
	public CriteresDossierPatient getCriteres() {
		return criteres;
	}

	/**
	 * @param criteres the criteres to set
	 */
	public void setCriteres(CriteresDossierPatient criteres) {
		this.criteres = criteres;
	}
}
