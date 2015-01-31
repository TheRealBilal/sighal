package applimedical.sighal.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.Personnel;
import applimedical.sighal.business.PersonneBusiness;
import applimedical.sighal.dao.PersonnelRepository;
import applimedical.sighal.dto.FonctionDto;
import applimedical.sighal.dto.PersonnelDto;

@Service("personneBusiness")
@Transactional
public class PersonneBusinessImpl implements PersonneBusiness {
	@Autowired
	private PersonnelRepository personnelRepo;

   @Override
	@Transactional(readOnly = true)
	public boolean authentifier(String login, String mdp) {
		Personnel personnel = personnelRepo.findByLogin(login); 
		return personnel !=null && personnel.getMotDePasse().equals(mdp);
	}

	@Override
   @Transactional(readOnly = true)
   public PersonnelDto chargerPersonnel(String login) {
      Personnel personnel = personnelRepo.findByLogin(login); 
      if (personnel == null) {
         return null;
      }
      PersonnelDto personnelDto = new PersonnelDto();
      personnelDto.setPersonneId(personnel.getPersonneId());
      personnelDto.setNom(personnel.getNom());
      personnelDto.setPrenom(personnel.getPrenom());
      personnelDto.setLogin(personnel.getLogin());
      personnelDto.setMotDePasse(personnel.getMotDePasse());
      personnelDto.setFonctionDto(new FonctionDto());
      if (personnel.getFonction() != null) {
         personnelDto.getFonctionDto().setNomFonction(
               personnel.getFonction().getNomFonction());
      }
      return personnelDto;
   }
}
