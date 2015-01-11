package applimedical.sighal.web.dossiers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import applimedical.sighal.business.FichePatientBusiness;
import applimedical.sighal.dto.FichePatientDto;

import org.primefaces.event.FlowEvent;
			
@Controller("FichePatientBn")
@ManagedBean
@ViewScoped
public class FichePatientMgBean {
	
	@Autowired
	private FichePatientBusiness fichePatientBusiness;
	
	private FichePatientDto selectedFichePatient ;
	private List<FichePatientDto> fichepatientList;
	
	 @PostConstruct
	   public void init() {
		 selectedFichePatient = new FichePatientDto();
		 fichepatientList = fichePatientBusiness.getToutesLesFichesPatient();
	   }
	 
	 public String startPage() {
	      selectedFichePatient = new FichePatientDto();
	      fichepatientList = fichePatientBusiness.getToutesLesFichesPatient();
	      return "listeFichePatient";
	   }
	 public String rechercher() {
	      return "listeFichePatient";
	   }

	   public String initCreer() {
	      selectedFichePatient = new FichePatientDto();
	      return "editionFichePatient";
	   }

	   public String initModifier(FichePatientDto fichePatientDto) {
	      selectedFichePatient = fichePatientDto;
	      return "editionFichePatient";
	   }

	   public String sauvegarder() {
		   fichePatientBusiness.sauvegarderFichePatient(selectedFichePatient);
	      return startPage();
	   }

	   public String supprimer(String fichepatientId) {
	      fichePatientBusiness.supprimerSalle(Long.valueOf(fichepatientId));
	      return startPage();
	   }
	   public String onFlowProcess(FlowEvent event) {
	        
	            return event.getNewStep();
	        }

	   public FichePatientDto getselectedFichePatient() {
	      return selectedFichePatient;
	   }

	   public void setselectedFichePatient(FichePatientDto selectedFichePatient) {
	      this.selectedFichePatient = selectedFichePatient;
	   }

	   public List<FichePatientDto> getfichepatientList() {
	      return fichepatientList;
	   }

	   public void setfichepatientList(List<FichePatientDto> fichepatientList) {
	      this.fichepatientList = fichepatientList;
	   }
	 
}