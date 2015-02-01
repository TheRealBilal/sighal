package applimedical.sighal.utils;

import java.util.ArrayList;
import java.util.List;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.api.pojo.Personnel;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.FichePatientDto;
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
			doss.setFichePatientList(fichesPatientDtoToEntities(dossierDto.getFichePatientDtoList()));


		return doss;
	}

	public static  List<FichePatient> fichesPatientDtoToEntities(
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
		return null;
	}

	public static  FichePatient fichePatientDtoToEntity(FichePatientDto ficheDto) {

		FichePatient fiche = new FichePatient();

		fiche.setFichePatientId(ficheDto.getFichePatientId());
		fiche.setDateCreation(ficheDto.getDateCreation());
		fiche.setDateModification(ficheDto.getDateModification());

		//TODO il faut ajouter la fiche dans la liste des fiches dans dossier
		fiche.setDossierPatient(null);
		//TODO 
		fiche.setInterventionList(null);

		fiche.setEtatGeneraleActuelPatient(ficheDto.getEtatGeneraleActuelPatient());
		fiche.setObservation(ficheDto.getObservation());
		fiche.setPersonnel(personnelDtoToEntity(ficheDto.getPersonnelDto()));
		fiche.setPlanTraitement(ficheDto.getPlanTraitement());
		fiche.setTypeFichePatient(ficheDto.getTypeFichePatient());


		return fiche;
	}

	public static DossierPatientDto dossierPatientEntityToDto(DossierPatient dossierEnt){
		return null;
	}


	public static PatientDto patientEntityToDto(Patient passient){
		return null;
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
}
