package applimedical.sighal.business;

import java.util.List;

import applimedical.sighal.api.pojo.Salle;

public interface RessourceBusiness extends BaseBusiness<Salle, Long> {
	List<Salle> findSalles(String code, String nom);
}
