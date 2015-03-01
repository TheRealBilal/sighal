package applimedical.sighal.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import applimedical.sighal.api.pojo.Salle;
import applimedical.sighal.business.BaseBusinessImpl;
import applimedical.sighal.business.RessourceBusiness;
import applimedical.sighal.dao.SalleRepository;

@Service("ressourceBusiness")
@Transactional
public class RessourceBusinessImpl extends BaseBusinessImpl<Salle, Long>
   implements RessourceBusiness {

   @Autowired
   private SalleRepository salleRep;
   @Transactional(readOnly=true)
	public List<Salle> findSalles(String code, String nom) {
      List<Salle> salleList = salleRep.findListeSalle(
            code == null ? "%" : "%" + code +"%",
            nom == null ? "%" : "%" + nom +"%");
      return salleList;
	}

}
