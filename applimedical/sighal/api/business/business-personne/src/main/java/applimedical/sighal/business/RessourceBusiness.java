package applimedical.sighal.business;

import java.util.List;

import applimedical.sighal.dto.SalleDto;

public interface RessourceBusiness {
	List<SalleDto> getToutesLesSalles();
	SalleDto getSalleParId(Long salleId);
	SalleDto sauvegarderSalle(SalleDto salleDto);
	void supprimerSalle(Long salleId);
}
