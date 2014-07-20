package applimedical.sighal.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.Personnel;
import applimedical.sighal.business.PersonnelBusiness;
import applimedical.sighal.dao.PersonnelRepository;
import applimedical.sighal.dto.PersonnelDto;

@Service("PersonnelBusiness")
@Transactional
public class PersonnelBusinessImpl implements PersonnelBusiness {
	@Autowired
	private PersonnelRepository personnelRepo ;
	public PersonnelDto getPersonnelDtoParId(Long PeronnelId) {
		Personnel personnel= personnelRepo.getOne(PeronnelId);
		PersonnelDto personnelDto = new PersonnelDto();
		personnelDto.setAdresse(personnel.getAdresse());
		personnelDto.setCivilite(personnel.getCivilite());
		personnelDto.setCodePostale(personnel.getCodePostale());
		personnelDto.setDateEmbauche(personnel.getDateEmbauche());
		personnelDto.setDateNaissance(personnel.getDateNaissance());
		personnelDto.setEmail(personnel.getEmail());
		personnelDto.setExperience(personnel.getExperience());
		personnelDto.setMatricule(personnel.getMatricule());
		personnelDto.setNom(personnel.getNom());
		personnelDto.setNomJeuneFille(personnel.getNomJeuneFille());
		personnelDto.setPays(personnel.getPays());
		//personnelDto.setPersonnelServiceDtoList(personnelServiceDtoList)
		personnelDto.setPrenom(personnel.getPrenom());
		//personnelDto.setQualificationDtoList(qualificationDtoList);
		personnelDto.setRegion(personnel.getRegion());
		//personnelDto.setRendezVousArrangeDtoList(rendezVousArrangeDtoList);
		//personnelDto.setRendezVousPourDtoList(rendezVousPourDtoList);
		personnelDto.setSalaire(personnel.getSalaire());
		personnelDto.setSex(personnel.getSex());
		personnelDto.setTelephonne(personnel.getTelephonne());
		personnelDto.setTitre(personnel.getTitre());
		personnelDto.setVille(personnel.getVille());
		return personnelDto;
		
	}

}
