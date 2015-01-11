package applimedical.sighal.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.business.FichePatientBusiness;
import applimedical.sighal.dao.FichePatientRepository;
import applimedical.sighal.dto.FichePatientDto;


@Service("FichePatientBusiness")
@Transactional
public class FichePatientBusinessImpl implements FichePatientBusiness {
	@Autowired
	private FichePatientRepository fichePatientRepo;
	
	
	public List<FichePatientDto> getToutesLesFichesPatient() {
		List<FichePatient> fichePatients= fichePatientRepo.findAll();
		List<FichePatientDto> fichePatientDtos = new ArrayList<FichePatientDto>( );
		for(FichePatient fichePatient : fichePatients){
			FichePatientDto fichePatientDto = new FichePatientDto();
			fichePatientDto.setDateCreation(fichePatient.getDateCreation());
			fichePatientDto.setDateModification(fichePatient.getDateModification());
			//fichePatientDto.setDossierPatientDto(getDossierPatientParId(fichePatient.getDossierPatient().getDossierPatientId()));
			fichePatientDto.setEtatGeneraleActuelPatient(fichePatient.getEtatGeneraleActuelPatient());
			fichePatientDto.setFichePatientId(fichePatient.getFichePatientId());
			//fichePatientDto.setInterventionDtoList()
			fichePatientDto.setObservation(fichePatient.getObservation());
//			fichePatientDto.setPersonnelDto(new PersonnelBusinessImpl().getPersonnelDtoParId(fichePatient.getPersonnel().getPersonneId()));;
			fichePatientDto.setPlanTraitement(fichePatient.getPlanTraitement());
			fichePatientDto.setTypeFichePatient(fichePatient.getTypeFichePatient());
			fichePatientDtos.add(fichePatientDto);	
			
		}
		
		return fichePatientDtos;
	}

	public FichePatientDto getFichePatienParId(Long fichePatientId) {
		
	
		FichePatient fichePatient = fichePatientRepo.findOne(fichePatientId);

			FichePatientDto fichePatientDto = new FichePatientDto();
			fichePatientDto.setDateCreation(fichePatient.getDateCreation());
			fichePatientDto.setDateModification(fichePatient.getDateModification());
			//fichePatientDto.setDossierPatientDto();
			fichePatientDto.setEtatGeneraleActuelPatient(fichePatient.getEtatGeneraleActuelPatient());
			fichePatientDto.setFichePatientId(fichePatient.getFichePatientId());
			//fichePatientDto.setInterventionDtoList()
			fichePatientDto.setObservation(fichePatient.getObservation());
			fichePatientDto.setPersonnelDto(new PersonnelBusinessImpl().getPersonnelDtoParId(fichePatientId));
			fichePatientDto.setPlanTraitement(fichePatient.getPlanTraitement());
			fichePatientDto.setTypeFichePatient(fichePatient.getTypeFichePatient());	
			
		return fichePatientDto;
	}

	public FichePatientDto sauvegarderFichePatient(FichePatientDto fichePatientDto){
			
			FichePatient fichePatient;
			      if (fichePatientDto.getFichePatientId() == null) {
			         fichePatient = new FichePatient();
			      } else {
			         fichePatient = fichePatientRepo.findOne(fichePatientDto.getFichePatientId());
			      }
			      fichePatient.setDateCreation(fichePatientDto.getDateCreation());
			      fichePatient.setDateModification(fichePatientDto.getDateModification());
			      //fichePatient.setDossierPatient();
			      fichePatient.setEtatGeneraleActuelPatient(fichePatientDto.getEtatGeneraleActuelPatient());
			      //fichePatient.setFichePatientId(fichePatientDto.getFichePatientId());fiche patient dto possède un id en creation?
			      //fichePatient.setInterventionList();
			      fichePatient.setObservation(fichePatientDto.getObservation());	
			      
		//	      fichePatient.setPersonnel(personnelRepository.findOne(fichePatientDto.getPersonnelDto().getPersonneId()));
			      fichePatient.setPlanTraitement(fichePatientDto.getPlanTraitement());
			      fichePatient.setTypeFichePatient(fichePatientDto.getTypeFichePatient());
			      
			      
			      FichePatient newFichePatient = fichePatientRepo.save(fichePatient);
			      fichePatientDto.setFichePatientId(newFichePatient.getFichePatientId());
			      return fichePatientDto;
			   
	}

	public void supprimerSalle(Long fichePatientId) {
		fichePatientRepo.delete(fichePatientId);

	}

}
