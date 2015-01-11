/**
 * 
 */
package applimedical.sighal.web.dossiers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.springframework.stereotype.Controller;

import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.PatientDto;

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
