package applimedical.sighal.web.dossiers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import applimedical.sighal.api.constantes.DomaineEnum;
import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.business.FichePatientGeneraleBusiness;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.FichePatientDto;
import applimedical.sighal.dto.FichePatientGeneraleDto;
			
@Controller("fichePatientBn")
@ManagedBean(name="fichePatientMgBean")
@SessionScoped
public class FichePatientMgBean {
	
	@Autowired
	private FichePatientGeneraleBusiness  fichePatientGeneraleBusiness;
	
	@Autowired
	private DossierPatientBusiness dossierPatientBusiness;
	
	private FichePatientGeneraleDto selectedFichePatientGenerale ;
	private List<FichePatientDto> fichepatientPatientList;
	private DossierPatientDto dossierPatientDto;
	private DomaineEnum[] domaineEnum;
	private String seletedDomaine ;
	private Long idDossier;

	@PostConstruct
	   public void init() {
		 selectedFichePatientGenerale = new FichePatientGeneraleDto();
		 fichepatientPatientList = new ArrayList<FichePatientDto>();
		 dossierPatientDto = new DossierPatientDto();
	   }
	 
	public String startPage() {
		
	      selectedFichePatientGenerale = new FichePatientGeneraleDto();
	      fichepatientPatientList = new ArrayList<FichePatientDto>();
	      //setDossierPatientDto(selectedFichePatient.getDossierPatientDto());

	      seletedDomaine = DomaineEnum.AUTRE.toString();
	            
	      
	      selectedFichePatientGenerale =fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(1);
	      
	      return "listeFichePatient";
	   }
	
	
	
	public String startPageWithNumDossier() {
		
		
		dossierPatientDto = dossierPatientBusiness.getDossierPatient(idDossier);
		
	      
	      fichepatientPatientList= dossierPatientDto.getFichePatientDtoList();
	      
	      //setDossierPatientDto(selectedFichePatient.getDossierPatientDto());

	     
	      return "listeFichePatient";
	   }
	 public void onDomaineChange(){
		if (fichepatientPatientList!=null) 
			fichepatientPatientList.clear();
		
		else
			fichepatientPatientList = new ArrayList<FichePatientDto>();
		 if (seletedDomaine.equals("generale")){
			  
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(1));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(1));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(1));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(1));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(1));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(1));
			 
		 }
		 else if(seletedDomaine.equals("dentiste")){
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(0));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(0));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(0));

			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(0));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(0));
			 fichepatientPatientList.add(fichePatientGeneraleBusiness.getToutesLesFichesPatientGenerale().get(0));
}
		 RequestContext.getCurrentInstance().scrollTo("frmFichePatient:listFP:3:id_");
	 }
	 public String rechercher() {
	      return "listeFichePatient";
	   }

	   public String initCreer() {
	      selectedFichePatientGenerale = new FichePatientGeneraleDto();
	      
	      setDossierPatientDto(new DossierPatientDto());
	      return "editionFichePatient";
	   }
	   

	   public FichePatientGeneraleBusiness getFichePatientBusiness() {
		return fichePatientGeneraleBusiness;
	}

	public void setFichePatientBusiness(FichePatientGeneraleBusiness fichePatientBusiness) {
		this.fichePatientGeneraleBusiness = fichePatientBusiness;
	}

	public FichePatientDto getSelectedFichePatient() {
		return selectedFichePatientGenerale;
	}

	public void setSelectedFichePatient(FichePatientDto selectedFichePatient) {
		this.selectedFichePatientGenerale = selectedFichePatientGenerale;
	}

	public List<FichePatientDto> getFichepatientList() {
		return fichepatientPatientList;
	}

	public void setFichepatientList(List<FichePatientDto> fichepatientList) {
		this.fichepatientPatientList = fichepatientList;
	}

	public DossierPatientDto getDossierPatientDto() {
		return dossierPatientDto;
	}

	public void setDossierPatientDto(DossierPatientDto dossierPatientDto) {
		this.dossierPatientDto = dossierPatientDto;
	}

	public String initModifier(FichePatientGeneraleDto fichePatientGeneraleDto) {
	      selectedFichePatientGenerale = fichePatientGeneraleDto;
	      
	      return "editionFichePatient";
	   }

	   public String sauvegarder() {
		   fichePatientGeneraleBusiness.sauvegarderFichePatientGenerale(selectedFichePatientGenerale);
	      return startPage();
	   }

	   public String supprimer(String fichepatientId) {
	      fichePatientGeneraleBusiness.supprimerFichePatientGenerale(Long.valueOf(fichepatientId));
	      return startPage();
	   }
	   public String onFlowProcess(FlowEvent event) {
	        
	            return event.getNewStep();
	        }

	   public FichePatientDto getselectedFichePatient() {
	      return selectedFichePatientGenerale;
	   }

	   public void setselectedFichePatient(FichePatientGeneraleDto selectedFichePatientGenerale) {
	      this.selectedFichePatientGenerale = selectedFichePatientGenerale;
	   }

	   public List<FichePatientDto> getfichepatientList() {
	      return fichepatientPatientList;
	   }

	   public void setfichepatientList(List<FichePatientDto> fichepatientList) {
	      this.fichepatientPatientList = fichepatientList;
	   }

	public DomaineEnum[] getDomaineEnum() {
		return domaineEnum;
	}

	public void setDomaineEnum(DomaineEnum[] domaineEnum) {
		this.domaineEnum = domaineEnum;
	}

	public String getSeletedDomaine() {
		return seletedDomaine;
	}

	public void setSeletedDomaine(String seletedDomaine) {
		this.seletedDomaine = seletedDomaine;
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
