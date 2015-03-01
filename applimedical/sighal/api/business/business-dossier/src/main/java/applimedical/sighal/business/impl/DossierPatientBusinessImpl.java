package applimedical.sighal.business.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.criteres.CriteresDossierPatient;
import applimedical.sighal.dao.DossierPatientRepository;
import applimedical.sighal.dao.PatientRepository;
import applimedical.sighal.dao.PersonnelRepository;


@Service("DossierPatientBusiness")
@Transactional
public class DossierPatientBusinessImpl implements DossierPatientBusiness {

	@Autowired
	private PersonnelRepository personnelRepo;

	@Autowired
	private DossierPatientRepository dossierPatientRepository;
	
	@Autowired
	private PatientRepository patientRepository;


	public Long createDossierPatient(Patient patient){
		Patient pat = patientRepository.save(patient);
		return pat.getDossierPatient().getId();
	}


	public List<FichePatient> getListeFichePatient(Long dossierPatientId) {

		DossierPatient dossierPatient= dossierPatientRepository.findOne(dossierPatientId);
		
		dossierPatient.getFichePatientList();
		return dossierPatient.getFichePatientList();
		
		
	}
	
	public DossierPatient getDossierPatient(Long id){
		
		DossierPatient dossierPatient = dossierPatientRepository.getOne(id);
		dossierPatient.getFichePatientList();
		
		return dossierPatient;
	}

	public List<Patient> recherchePatientDossier(CriteresDossierPatient criteres){
		List<Patient>resultPat= patientRepository.findListePatient(
				criteres.getNom()==null ? "%" : "%" + criteres.getNom() +"%",
				criteres.getPrenom()==null ? "%" : "%" + criteres.getPrenom() +"%",
				criteres.getNumDossier()==null||criteres.getNumDossier().isEmpty()? null : Long.valueOf(criteres.getNumDossier()),
				criteres.getMatricule());

		return resultPat;
	}

}
