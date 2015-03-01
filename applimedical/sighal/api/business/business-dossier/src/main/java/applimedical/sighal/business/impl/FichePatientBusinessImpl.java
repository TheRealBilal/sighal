package applimedical.sighal.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.business.FichePatientBusiness;
import applimedical.sighal.dao.FichePatientRepository;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.FichePatientDto;
import applimedical.sighal.dto.PatientDto;


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
			setPatientDefichePatient(fichePatientDto, fichePatient);
			fichePatientDto.getDossierPatientDto().setDateCreation(fichePatient.getDateCreation());
			fichePatientDto.getDossierPatientDto().setDateModification(fichePatient.getDateModification());				
			
			//
			fichePatientDto.setEtatGeneraleActuelPatient(fichePatient.getEtatGeneraleActuelPatient());
			fichePatientDto.setFichePatientId(fichePatient.getId());
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
			setPatientDefichePatient(fichePatientDto, fichePatient);
			fichePatientDto.getDossierPatientDto().setDateCreation(fichePatient.getDateCreation());
			fichePatientDto.getDossierPatientDto().setDateModification(fichePatient.getDateModification());				
			fichePatientDto.setEtatGeneraleActuelPatient(fichePatient.getEtatGeneraleActuelPatient());
			fichePatientDto.setFichePatientId(fichePatient.getId());
			//fichePatientDto.setInterventionDtoList()
			fichePatientDto.setObservation(fichePatient.getObservation());
			fichePatientDto.setPersonnelDto(new PersonnelBusinessImpl().getPersonnelDtoParId(fichePatientId));
			fichePatientDto.setPlanTraitement(fichePatient.getPlanTraitement());
			fichePatientDto.setTypeFichePatient(fichePatient.getTypeFichePatient());	
			
		return fichePatientDto;
	}
	public void setPatientDefichePatient (FichePatientDto fichePatientDto,FichePatient fichePatient){
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
			      fichePatientDto.setFichePatientId(newFichePatient.getId());
			      return fichePatientDto;
			   
	}

	public void supprimerSalle(Long fichePatientId) {
		fichePatientRepo.delete(fichePatientId);

	}

}
