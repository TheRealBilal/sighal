/**
 * 
 */
package applimedical.sighal.web.dossiers;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.business.RessourceBusiness;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.PatientDto;
import applimedical.sighal.security.UserUtils;

@Controller("dossPati")
@ManagedBean
@ViewScoped
public class DossierPatientBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4764922958280561337L;
	private boolean skip;

	private DossierPatientDto dossierPatient = new DossierPatientDto();

	private PatientDto patient ;
	@Autowired
	private DossierPatientBusiness dossierPatientBusiness ;	

	public String initCreer() {
		setPatient(new PatientDto());
		return "creerDossierPatient";
	}


	public String onFlowProcess(FlowEvent event) {
		if(skip) {
			skip = false;   //reset in case user goes back
			return "confirm";
		}
		else {
			return event.getNewStep();
		}
	}

	public void save() {       
		DossierPatientDto dossier= new DossierPatientDto();
//		dossier.setPatientDto(patient);
		dossier.setDateCreation(new Date());
		dossier.setPersonnelDto(UserUtils.utilisateurCourant());
		
		patient.setDossierPatientDto(dossier);
		patient.setPersonneId(UserUtils.utilisateurCourant().getPersonneId());
		
		
		Long numeroDossier = dossierPatientBusiness.createDossierPatient(patient);
		FacesMessage msg = new FacesMessage("Successful", "création de :" + numeroDossier +" avec succes");
		FacesContext.getCurrentInstance().addMessage(null, msg);
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
	 * @return the dossierPatient
	 */
	public DossierPatientDto getDossierPatient() {
		return dossierPatient;
	}
	/**
	 * @param dossierPatient the dossierPatient to set
	 */
	public void setDossierPatient(DossierPatientDto dossierPatient) {
		this.dossierPatient = dossierPatient;
	}
}
