package applimedical.sighal.business.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.dao.DossierPatientRepository;
import applimedical.sighal.dao.PatientRepository;
import applimedical.sighal.dao.PersonnelRepository;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.FichePatientDto;
import applimedical.sighal.dto.PatientDto;
import applimedical.sighal.utils.MappingUtils;


@Service("DossierPatientBusiness")
@Transactional
public class DossierPatientBusinessImpl implements DossierPatientBusiness {

	@Autowired
	private PersonnelRepository personnelRepo;
	
	@Autowired
	private DossierPatientRepository dossierPatientRepository;
	
	@Autowired
	private PatientRepository patientRepository;
 	
	
	public Long createDossierPatient(PatientDto patientDto){
		Patient pat = patientRepository.save(MappingUtils.patientDtoToEntity(patientDto));
		return pat.getDossierPatient().getDossierPatientId();
	}


	public List<FichePatientDto> getListeFichePatient(Long dossierPatientId) {

		DossierPatient dossierPatient= dossierPatientRepository.findOne(dossierPatientId);
		
		
		return MappingUtils.fichesPatientEntitiesToDto(dossierPatient.getFichePatientList());
		
		
	}
	
	public DossierPatientDto getDossierPatient(Long id){
		
		DossierPatient dossierPatient = dossierPatientRepository.getOne(id);
		
		
		return MappingUtils.dossierPatientEntityToDto(dossierPatient);
	}
	
}
