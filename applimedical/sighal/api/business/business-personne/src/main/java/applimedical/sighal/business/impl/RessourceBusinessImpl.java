package applimedical.sighal.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.Salle;
import applimedical.sighal.business.RessourceBusiness;
import applimedical.sighal.dao.SalleRepository;
import applimedical.sighal.dto.SalleDto;

@Service("ressourceBusiness")
@Transactional
public class RessourceBusinessImpl implements RessourceBusiness {
	@Autowired
	private SalleRepository salleRepo;

	public List<SalleDto> getToutesLesSalles() {
	   List<Salle> salleList = salleRepo.findAll();
	   List<SalleDto> salleDtoList = new ArrayList<SalleDto>();
	   for (Salle salleIt : salleList) {
	      SalleDto salleDto = new SalleDto();
	      salleDto.setSalleId(salleIt.getSalleId());
	      salleDto.setNomSalle(salleIt.getNomSalle());
	      salleDto.setCodeSalle(salleIt.getCodeSalle());
	      salleDto.setDescriptionSalle(salleIt.getDescriptionSalle());
	      salleDto.setCommentarySalle(salleIt.getCommentarySalle());
	      salleDtoList.add(salleDto);
      }
	   return salleDtoList;
	}

	public SalleDto getSalleParId(Long salleId) {
	   Salle salle = salleRepo.findOne(salleId);
      SalleDto salleDto = new SalleDto();
      salleDto.setSalleId(salle.getSalleId());
      salleDto.setNomSalle(salle.getNomSalle());
      salleDto.setCodeSalle(salle.getCodeSalle());
      salleDto.setDescriptionSalle(salle.getDescriptionSalle());
      salleDto.setCommentarySalle(salle.getCommentarySalle());
	   return salleDto;
	}

	public List<SalleDto> getSalles(String code, String nom) {
      List<Salle> salleList = salleRepo.findListeSalle(
            code == null ? "%" : "%" + code +"%",
            nom == null ? "%" : "%" + nom +"%");
      List<SalleDto> salleDtoList = new ArrayList<SalleDto>();
      for (Salle salleIt : salleList) {
         SalleDto salleDto = new SalleDto();
         salleDto.setSalleId(salleIt.getSalleId());
         salleDto.setNomSalle(salleIt.getNomSalle());
         salleDto.setCodeSalle(salleIt.getCodeSalle());
         salleDto.setDescriptionSalle(salleIt.getDescriptionSalle());
         salleDto.setCommentarySalle(salleIt.getCommentarySalle());
         salleDtoList.add(salleDto);
      }
      return salleDtoList;
	}

   public SalleDto sauvegarderSalle(SalleDto salleDto) {
      Salle salle;
      if (salleDto.getSalleId() == null) {
         salle = new Salle();
      } else {
         salle = salleRepo.findOne(salleDto.getSalleId());
      }
      salle.setNomSalle(salleDto.getNomSalle());
      salle.setCodeSalle(salleDto.getCodeSalle());
      salle.setDescriptionSalle(salleDto.getDescriptionSalle());
      salle.setCommentarySalle(salleDto.getCommentarySalle());      
      Salle newSalle = salleRepo.save(salle);
      salleDto.setSalleId(newSalle.getSalleId());
      return salleDto;
   }

   public void supprimerSalle(Long salleId) {
      salleRepo.delete(salleId);
   }
}
