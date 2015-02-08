package applimedical.sighal.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.FichePatientGenerale;
import applimedical.sighal.business.FichePatientGeneraleBusiness;
import applimedical.sighal.dao.FichePatientGeneraleRepository;
import applimedical.sighal.dao.FichePatientRepository;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.FichePatientDto;
import applimedical.sighal.dto.FichePatientGeneraleDto;
import applimedical.sighal.dto.PatientDto;


@Service("FichePatientGeneraleBusiness")
@Transactional
public class FichePatientGeneraleBusinessImpl implements
		FichePatientGeneraleBusiness {
	
	@Autowired
	private FichePatientGeneraleRepository fichePatientGeneraleRepository;

	public List<FichePatientGeneraleDto> getToutesLesFichesPatientGenerale() {
		
		List<FichePatientGeneraleDto> fichePatientGeneraleDtosList = new ArrayList<FichePatientGeneraleDto>();
		List<FichePatientGenerale> listFichePatientGenerale = fichePatientGeneraleRepository.findAll();
		for(FichePatientGenerale fichePatientGenerale:listFichePatientGenerale){
			FichePatientGeneraleDto dto = new FichePatientGeneraleDto();
			
			fichePatientGeneraleDtosList.add(dto);
			
		}
		
		return fichePatientGeneraleDtosList;
	}

	public FichePatientGeneraleDto getFichePatienGeneraleParId(
			Long fichePatientgeneraleId) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public FichePatientDto sauvegarderFichePatientGenerale(
			FichePatientGeneraleDto fichePatientGeneraleDto) {
		// TODO Auto-generated method stub
		return null;
	}

	public void supprimerFichePatientGenerale(Long ficheFichePatientGeneraleId) {
		// TODO Auto-generated method stub

	}
	public void setPatientDefichePatient (FichePatientGeneraleDto fichePatientDto,FichePatientGenerale fichePatient){
		fichePatientDto.setDossierPatientDto(new DossierPatientDto());
		fichePatientDto.getDossierPatientDto().setPatientDto(new PatientDto());
		fichePatientDto.getDossierPatientDto().getPatientDto().setCivilite(fichePatient.getDossierPatient().getPatient().getCivilite());
		fichePatientDto.getDossierPatientDto().getPatientDto().setAdresse(fichePatient.getDossierPatient().getPatient().getAdresse());
		fichePatientDto.getDossierPatientDto().getPatientDto().setNom(fichePatient.getDossierPatient().getPatient().getNom());
		fichePatientDto.getDossierPatientDto().getPatientDto().setPrenom(fichePatient.getDossierPatient().getPatient().getPrenom());
		fichePatientDto.getDossierPatientDto().getPatientDto().setNomJeuneFille(fichePatient.getDossierPatient().getPatient().getNomJeuneFille());
		fichePatientDto.getDossierPatientDto().getPatientDto().setDateNaissance(fichePatient.getDossierPatient().getPatient().getDateNaissance());
		fichePatientDto.getDossierPatientDto().getPatientDto().setMatricule(fichePatient.getDossierPatient().getPatient().getMatricule());
	}


}
