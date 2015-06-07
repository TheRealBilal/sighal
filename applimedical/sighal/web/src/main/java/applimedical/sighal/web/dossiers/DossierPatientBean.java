/**
 * 
 */
package applimedical.sighal.web.dossiers;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import applimedical.sighal.api.constantes.DomaineEnum;
import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.security.UserUtils;

// c'est quoi ça dosspati
@Controller("dossPati")
@Scope("session")
public class DossierPatientBean implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 4764922958280561337L;
	private boolean skip;

	private DossierPatient dossierPatient = new DossierPatient();


	private Patient patient ;
	@Autowired
	private DossierPatientBusiness dossierPatientBusiness ;	
	
	@Autowired
	private FichePatientMgBean fichePatientMgBean;
	
	private String seletedDomaine ;

	private List<FichePatient> fichepatientPatientList;
	private DomaineEnum[] domaineEnum;
	
	public String initCreer() {
		patient= new Patient();
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

	public String enregistrer() {       
		
		
		
		DossierPatient dossier= new DossierPatient();
//		dossier.setPatientDto(patient);
		dossier.setDateCreation(new Date());
		dossier.setPersonnel(UserUtils.utilisateurCourant());
		
		patient.setDossierPatient(dossier);
		patient.setId(UserUtils.utilisateurCourant().getId());
		
		
		Long numeroDossier = dossierPatientBusiness.createDossierPatient(patient);
		FacesMessage msg = new FacesMessage("Successful", "création de :" + numeroDossier +" avec succes");
		
		FacesContext.getCurrentInstance().addMessage(null, msg);	
//		fichePatientMgBean = (FichePatientMgBean) ManagedBan.getManagedBean("fichePatientMgBean");
////		fichePatientMgBean.setIdDossier(numeroDossier);
////		fichePatientMgBean.setDossierPatientBusiness(dossierPatientBusiness);
		return startPageWithNumDossier(numeroDossier);
		 
	}
	
	
	public String startPage() {
		
	      seletedDomaine = DomaineEnum.AUTRE.toString();
	      
	      return "listeFichePatient";
	   }

	
	public String startPageWithNumDossier(DossierPatient dossierPatient) {
		setDossierPatient(dossierPatient);
		
		return startPageWithNumDossier(dossierPatient.getId());
	      
	   }
	
	
	public String startPageWithNumDossier(Long idDossier) {
		dossierPatient= dossierPatientBusiness.getDossierPatient(idDossier);
		setFichepatientPatientList(dossierPatient.getFichePatientList());
		return "listeFichePatient";
	   }
	

	/**
	 * @return the dossierPatient
	 */
	public DossierPatient getDossierPatient() {
		return dossierPatient;
	}


	/**
	 * @param dossierPatient the dossierPatient to set
	 */
	public void setDossierPatient(DossierPatient dossierPatient) {
		this.dossierPatient = dossierPatient;
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
	
	
	public String getSeletedDomaine() {
		return seletedDomaine;
	}

	public void setSeletedDomaine(String seletedDomaine) {
		this.seletedDomaine = seletedDomaine;
	}


	/**
	 * @return the fichepatientPatientList
	 */
	public List<FichePatient> getFichepatientPatientList() {
		return fichepatientPatientList;
	}


	/**
	 * @param fichepatientPatientList the fichepatientPatientList to set
	 */
	public void setFichepatientPatientList(List<FichePatient> fichepatientPatientList) {
		this.fichepatientPatientList = fichepatientPatientList;
	}
	

	public DomaineEnum[] getDomaineEnum() {
		return domaineEnum;
	}

	public void setDomaineEnum(DomaineEnum[] domaineEnum) {
		this.domaineEnum = domaineEnum;
	}
}
