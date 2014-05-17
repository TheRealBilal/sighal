package applimedical.sighal.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.Personnel;
import applimedical.sighal.business.PersonneBusiness;
import applimedical.sighal.dao.PersonnelRepository;

public class PersonneBusinessImpl implements PersonneBusiness {
	@Autowired
	private PersonnelRepository personnelRepo;
	
	@Transactional(readOnly = true)
	public boolean authentifier(String login, String mdp) {
		
		Personnel personnel = personnelRepo.findByLogin(login); 
		
		return personnel !=null && personnel.getMotDePasse().equals(mdp);
	}

}
