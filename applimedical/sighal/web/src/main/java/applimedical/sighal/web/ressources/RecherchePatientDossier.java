package applimedical.sighal.web.ressources;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.criteres.CriteresDossierPatient;

@Controller("dossPatiRechercher")
@ManagedBean
@ViewScoped
public class RecherchePatientDossier {
	@Autowired
	private DossierPatientBusiness dossierPatientBusiness ;
	
	private Patient patient = new Patient();
	private DossierPatient dossier = new DossierPatient();
	private List<Patient> resultList = new ArrayList<Patient>();
	CriteresDossierPatient criteres = new CriteresDossierPatient();
	private Patient patientSelectionne = new Patient();
	
	

	public String initCreer() {
		return "creerDossierPatient";
	}
	
	public String  startPage() {
		 return "recherchePatientDossier";
	   }
	
	 public String rechercher() {
		 
		 
		 resultList=dossierPatientBusiness.recherchePatientDossier(criteres);
	      return "recherchePatientDossier";
	   }

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the dossier
	 */
	public DossierPatient getDossier() {
		return dossier;
	}

	/**
	 * @param dossier the dossier to set
	 */
	public void setDossier(DossierPatient dossier) {
		this.dossier = dossier;
	}

	/**
	 * @return the resultList
	 */
	public List<Patient> getResultList() {
		return resultList;
	}

	/**
	 * @param resultList the resultList to set
	 */
	public void setResultList(List<Patient> resultList) {
		this.resultList = resultList;
	}

	/**
	 * @return the patientSelectionne
	 */
	public Patient getPatientSelectionne() {
		return patientSelectionne;
	}

	/**
	 * @param patientSelectionne the patientSelectionne to set
	 */
	public void setPatientSelectionne(Patient patientSelectionne) {
		this.patientSelectionne = patientSelectionne;
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
