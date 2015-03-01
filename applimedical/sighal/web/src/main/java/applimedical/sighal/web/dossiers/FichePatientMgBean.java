package applimedical.sighal.web.dossiers;

import javax.annotation.PostConstruct;

import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.FichePatientGenerale;
import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.business.FichePatientGeneraleBusiness;
			
@Controller("fichePatientMgBean")
@Scope("session")
public class FichePatientMgBean {
	
	@Autowired
	private FichePatientGeneraleBusiness  fichePatientGeneraleBusiness;
	
	@Autowired
	private DossierPatientBusiness dossierPatientBusiness;
	
	private FichePatientGenerale selectedFichePatientGenerale ;
	
	private DossierPatient dossierPatient;

	private Long idDossier;

	@PostConstruct
	   public void init() {
	   }
	 

	
	
	

	

	
	
	 public void onDomaineChange(){}
	
	 
	 
	 
	 
	 public String rechercher() {
	      return "listeFichePatient";
	   }

	   public String initCreer() {
	      
	      return "editionFichePatient";
	   }
	   

	   public FichePatientGeneraleBusiness getFichePatientBusiness() {
		return fichePatientGeneraleBusiness;
	}

	public void setFichePatientBusiness(FichePatientGeneraleBusiness fichePatientBusiness) {
		this.fichePatientGeneraleBusiness = fichePatientBusiness;
	}

	public FichePatient getSelectedFichePatient() {
		return selectedFichePatientGenerale;
	}

	public void setSelectedFichePatient(FichePatient selectedFichePatient) {
		this.selectedFichePatientGenerale = selectedFichePatientGenerale;
	}




	public DossierPatient getDossierPatient() {
		return dossierPatient;
	}

	public void setDossierPatient(DossierPatient dossierPatient) {
		this.dossierPatient = dossierPatient;
	}

	public String initModifier(FichePatientGenerale fichePatientGenerale) {
	      selectedFichePatientGenerale = fichePatientGenerale;
	      
	      return "editionFichePatient";
	   }

	   public String onFlowProcess(FlowEvent event) {
	        
	            return event.getNewStep();
	        }


	   public void setselectedFichePatient(FichePatientGenerale selectedFichePatientGenerale) {
	      this.selectedFichePatientGenerale = selectedFichePatientGenerale;
	   }


	

	public Long getIdDossier() {
		return idDossier;
	}

	public void setIdDossier(Long idDossier) {
		this.idDossier = idDossier;
	}

	public void setFichePatientGeneraleBusiness(
			FichePatientGeneraleBusiness fichePatientGeneraleBusiness) {
		this.fichePatientGeneraleBusiness = fichePatientGeneraleBusiness;
	}

	public void setDossierPatientBusiness(
			DossierPatientBusiness dossierPatientBusiness) {
		this.dossierPatientBusiness = dossierPatientBusiness;
	}


 
}
