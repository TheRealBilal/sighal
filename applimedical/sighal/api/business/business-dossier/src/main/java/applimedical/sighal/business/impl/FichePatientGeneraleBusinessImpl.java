package applimedical.sighal.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.FichePatientGenerale;
import applimedical.sighal.business.FichePatientGeneraleBusiness;
import applimedical.sighal.dao.FichePatientGeneraleRepository;


@Service("FichePatientGeneraleBusiness")
@Transactional
public class FichePatientGeneraleBusinessImpl implements
		FichePatientGeneraleBusiness {
	
	@Autowired
	private FichePatientGeneraleRepository fichePatientGeneraleRepository;

	public List<FichePatientGenerale> getToutesLesFichesPatientGenerale() {
		
		return fichePatientGeneraleRepository.findAll();
	}

	public FichePatientGenerale getFichePatienGeneraleParId(
			Long fichePatientgeneraleId) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public FichePatient sauvegarderFichePatientGenerale(
			FichePatientGenerale fichePatientGenerale) {
		// TODO Auto-generated method stub
		return null;
	}

	public void supprimerFichePatientGenerale(Long ficheFichePatientGeneraleId) {
		// TODO Auto-generated method stub

	}




}
