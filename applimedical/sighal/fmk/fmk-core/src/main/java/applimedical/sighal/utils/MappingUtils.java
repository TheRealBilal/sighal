package applimedical.sighal.utils;

import java.util.ArrayList;
import java.util.List;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.FichePatientGenerale;
import applimedical.sighal.api.pojo.Intervention;
import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.api.pojo.Personnel;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.FichePatientDto;
import applimedical.sighal.dto.FichePatientGeneraleDto;
import applimedical.sighal.dto.InterventionDto;
import applimedical.sighal.dto.PatientDto;
import applimedical.sighal.dto.PersonnelDto;

public class MappingUtils {

	public static<To, From> To transformEntityDto(Class<To> toClass, From entity) {
		To newTo = null;
		try {
			newTo = toClass.newInstance();


		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return newTo;
	}

	public static  DossierPatient dossierPatientDtoToEntity(DossierPatientDto dossierDto){
		DossierPatient doss = new DossierPatient();


		doss.setDateCreation(dossierDto.getDateCreation());
		doss.setDateModification(dossierDto.getDateModification());
		doss.setDossierPatientId(dossierDto.getDossierPatientId());

		if(null!= dossierDto.getPatientDto()){
			Patient patient=patientDtoToEntity(dossierDto.getPatientDto());
			doss.setPatient(patient);
		}

		if(null!=dossierDto.getPersonnelDto()){
			Personnel personnel = personnelDtoToEntity(dossierDto.getPersonnelDto());
			doss.setPersonnel(personnel);
		}

		if(null!= dossierDto.getFichePatientDtoList() && !! dossierDto.getFichePatientDtoList().isEmpty())
			doss.setFichePatientList(fichesPatientDtoToEntity(dossierDto.getFichePatientDtoList()));


		return doss;
	}

	public static  List<FichePatient> fichesPatientDtoToEntity(
			List<FichePatientDto> fichePatientDtoList) {

		List<FichePatient> listEnt = new ArrayList<FichePatient>();

		for (FichePatientDto ficheDto : fichePatientDtoList)
			listEnt.add(fichePatientDtoToEntity(ficheDto));

		return listEnt;
	}


	public static List<FichePatientDto> fichesPatientEntitiesToDto(
			List<FichePatient> fichePatientList) {



		List<FichePatientDto> listEnt = new ArrayList<FichePatientDto>();

		for (FichePatient fiche : fichePatientList)
			listEnt.add(fichePatientEntityToDto(fiche));

		return listEnt;

	}




	private static FichePatientDto fichePatientEntityToDto(FichePatient fiche) {
		
		FichePatientDto fichePatientDto = new FichePatientDto();
		fichePatientDto.setDateCreation(fiche.getDateCreation());
		fichePatientDto.setDateModification(fiche.getDateModification());
		fichePatientDto.setDossierPatientDto(new DossierPatientDto());
		fichePatientDto.getDossierPatientDto().setPatientDto( patientEntityToDto(fiche.getDossierPatient().getPatient()));
		fichePatientDto.getDossierPatientDto().setDateCreation(fiche.getDateCreation());
		fichePatientDto.getDossierPatientDto().setDateModification(fiche.getDateModification());				
		
		//
		fichePatientDto.setEtatGeneraleActuelPatient(fiche.getEtatGeneraleActuelPatient());
		fichePatientDto.setFichePatientId(fiche.getFichePatientId());
		fichePatientDto.setInterventionDtoList(MappingUtils.interventionListeEntityToDto(fiche.getInterventionList()));
		fichePatientDto.setObservation(fiche.getObservation());
//		fichePatientDto.setPersonnelDto(new PersonnelBusinessImpl().getPersonnelDtoParId(fichePatient.getPersonnel().getPersonneId()));;
		fichePatientDto.setPlanTraitement(fiche.getPlanTraitement());
		fichePatientDto.setTypeFichePatient(fiche.getTypeFichePatient());
			
		return fichePatientDto;
		
	}
	
	
	public static  PatientDto patientEntityToDto(Patient patient) {
		PatientDto dto = new PatientDto();
		dto.setCivilite(patient.getCivilite());
		dto.setAdresse(patient.getAdresse());
		dto.setNom(patient.getNom());
		dto.setPrenom(patient.getPrenom());
		dto.setNomJeuneFille(patient.getNomJeuneFille());
		dto.setDateNaissance(patient.getDateNaissance());
		dto.setMatricule(patient.getMatricule());
		
		return dto;
		
		
	}
	

	public static  FichePatient fichePatientDtoToEntity(FichePatientDto ficheDto) {

		FichePatient fiche = new FichePatient();

		fiche.setFichePatientId(ficheDto.getFichePatientId());
		fiche.setDateCreation(ficheDto.getDateCreation());
		fiche.setDateModification(ficheDto.getDateModification());
		fiche.setDossierPatient(MappingUtils.dossierPatientDtoToEntity(ficheDto.getDossierPatientDto()));

		List<Intervention> interventionListeDtoToEntity = MappingUtils.interventionListeDtoToEntity(ficheDto.getInterventionDtoList());
		fiche.setInterventionList(interventionListeDtoToEntity);

		fiche.setEtatGeneraleActuelPatient(ficheDto.getEtatGeneraleActuelPatient());
		fiche.setObservation(ficheDto.getObservation());
		fiche.setPersonnel(personnelDtoToEntity(ficheDto.getPersonnelDto()));
		fiche.setPlanTraitement(ficheDto.getPlanTraitement());
		fiche.setTypeFichePatient(ficheDto.getTypeFichePatient());


		return fiche;
	}



	public static  Patient patientDtoToEntity(PatientDto patient){
		Patient patientPojo = new Patient();
		patientPojo.setNom(patient.getNom());
		patientPojo.setNomJeuneFille(patient.getNomJeuneFille());
		patientPojo.setPrenom(patient.getPrenom());
		patientPojo.setSex(patient.getSex());
		patientPojo.setAdresse(patient.getAdresse());
		patientPojo.setCivilite(patient.getCivilite());
		patientPojo.setCodePostale(patient.getCodePostale());
		patientPojo.setEmail(patient.getEmail());
		patientPojo.setMatricule(patient.getMatricule());
		patientPojo.setPays(patient.getPays());
		patientPojo.setRegion(patient.getRegion());
		patientPojo.setTelephonne(patient.getTelephonne());
		patientPojo.setDossierPatient(dossierPatientDtoToEntity(patient.getDossierPatientDto()));
		return patientPojo;
	}


	public static PersonnelDto personnelEntityToDto(Personnel personnel){
		
		return null;
	}
	
	public static FichePatientGeneraleDto fichePatientGeneraleEntityToDto(FichePatientGenerale fichePatientGenerale){
		
		FichePatientGeneraleDto dto = new FichePatientGeneraleDto();
		dto.setDateCreation(fichePatientGenerale.getDateCreation());
		dto.setDateModification(fichePatientGenerale.getDateModification());
		dto.setDescription(fichePatientGenerale.getDescription());
		dto.setDomaine(fichePatientGenerale.getDomaine());
		dto.setEtatGeneraleActuelPatient(fichePatientGenerale.getEtatGeneraleActuelPatient());
		
		dto.setFichePatientId(fichePatientGenerale.getFichePatientId());
		
		dto.setObservation(fichePatientGenerale.getObservation());
		dto.setPlanTraitement(fichePatientGenerale.getPlanTraitement());
		
		
		dto.setTypeFichePatient(fichePatientGenerale.getTypeFichePatient());
		///remplir dossier patient
		dto.getDossierPatientDto().setPatientDto(MappingUtils.patientEntityToDto(fichePatientGenerale.getDossierPatient().getPatient()));
		return dto;
		
	}
	public static InterventionDto interventionEntityToDto(Intervention intervention){
		InterventionDto dto = new InterventionDto();
		dto.setDateIntervention(intervention.getDateIntervention());
		dto.setDescription(intervention.getDescription());
		dto.setDureeIntervention(intervention.getDureeIntervention());
		dto.setEvolution(intervention.getEvolution());
		dto.setFichePatientDto(MappingUtils.fichePatientEntityToDto(intervention.getFichePatient()));
		dto.setInterventionId(intervention.getInterventionId());
		//dto.setLigneSortieDtoList(ligneSortieDtoList) à completer 
		dto.setMotif_consultation(intervention.getMotif_consultation());
		dto.setPoids(intervention.getPoids());
		//dto.setRendezVousDto(intervention.getRendezVous()) /à completer
		//dto.setSoinDtoList(intervention.getSoinList()) à completer
		dto.setTension(intervention.getTension());
		//dto.setTypeInterventionDto(intervention.getTypeIntervention()); à completer
		return dto;
		
	}
	
	public static Intervention interventionDtoToEntity(InterventionDto interventionDto){
		Intervention intervention = new Intervention();
		intervention.setDateIntervention(interventionDto.getDateIntervention());
		intervention.setDescription(interventionDto.getDescription());
		intervention.setDureeIntervention(interventionDto.getDureeIntervention());
		intervention.setEvolution(interventionDto.getEvolution());
		intervention.setFichePatient(MappingUtils.fichePatientDtoToEntity(interventionDto.getFichePatientDto()));
		intervention.setInterventionId(interventionDto.getInterventionId());
		//dto.setLigneSortieDtoList(ligneSortieDtoList) à completer 
		intervention.setMotif_consultation(interventionDto.getMotif_consultation());
		intervention.setPoids(interventionDto.getPoids());
		//dto.setRendezVousDto(intervention.getRendezVous()) /à completer
		//dto.setSoinDtoList(intervention.getSoinList()) à completer
		intervention.setTension(interventionDto.getTension());
		//dto.setTypeInterventionDto(intervention.getTypeIntervention()); à completer
		
		return intervention;
	}

	public static  Personnel personnelDtoToEntity(PersonnelDto personnel){
		Personnel personnelPojo = new Personnel();
		personnelPojo.setPersonneId(personnel.getPersonneId());
		personnelPojo.setNom(personnel.getNom());
		personnelPojo.setNomJeuneFille(personnel.getNomJeuneFille());
		personnelPojo.setPrenom(personnel.getPrenom());
		personnelPojo.setSex(personnel.getSex());
		personnelPojo.setAdresse(personnel.getAdresse());
		personnelPojo.setCivilite(personnel.getCivilite());
		personnelPojo.setCodePostale(personnel.getCodePostale());
		personnelPojo.setEmail(personnel.getEmail());
		personnelPojo.setMatricule(personnel.getMatricule());
		personnelPojo.setPays(personnel.getPays());
		personnelPojo.setRegion(personnel.getRegion());
		personnelPojo.setTelephonne(personnel.getTelephonne());

		return personnelPojo;
	}
	
	public static List <Intervention> interventionListeDtoToEntity(List<InterventionDto> interventionListeDto){
		List <Intervention> interventionList = new ArrayList<Intervention>();
		for(InterventionDto interDto:interventionListeDto){
			interventionList.add(MappingUtils.interventionDtoToEntity(interDto));
		}
		return interventionList;
	}
	
	public static List <InterventionDto> interventionListeEntityToDto(List<Intervention> interventionListe){
		List <InterventionDto> interventionListDto = new ArrayList<InterventionDto>();
		
		for(Intervention inter:interventionListe){
			interventionListDto.add(MappingUtils.interventionEntityToDto((inter)));
		}
		return interventionListDto;
	}
	public static  DossierPatientDto dossierPatientEntityToDto(DossierPatient dossierPatient){
		DossierPatientDto dto = new DossierPatientDto();
		dto.setDateCreation(dossierPatient.getDateCreation());
		dto.setDateModification(dossierPatient.getDateModification());
		dto.setPatientDto(MappingUtils.patientEntityToDto(dossierPatient.getPatient()));
		dto.setDossierPatientId(dossierPatient.getDossierPatientId());
		dto.setFichePatientDtoList(MappingUtils.fichesPatientEntitiesToDto(dossierPatient.getFichePatientList()));
		dto.setPersonnelDto(MappingUtils.personnelEntityToDto(dossierPatient.getPersonnel()));
		return dto;	}
}
