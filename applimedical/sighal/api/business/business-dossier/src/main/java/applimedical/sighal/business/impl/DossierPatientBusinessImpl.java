package applimedical.sighal.business.impl;

import java.lang.reflect.Field;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.business.DossierPatientBusiness;
import applimedical.sighal.dao.DossierPatientRepository;
import applimedical.sighal.dao.PersonnelRepository;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.utils.MappingUtils;


@Service("DossierPatientBusiness")
@Transactional
public class DossierPatientBusinessImpl implements DossierPatientBusiness {

	@Autowired
	private PersonnelRepository personnelRepo;
	
	@Autowired
	private DossierPatientRepository dossierPatientRepository;
	
	
	public DossierPatientDto createDossierPassient(DossierPatientDto dossier){
		
		DossierPatient doss =dossierPatientRepository.save(MappingUtils.dossierPatientDtoToEntity(dossier));
		dossier.setDossierPatientId(doss.getDossierPatientId());
		return dossier;
	}
	
}
