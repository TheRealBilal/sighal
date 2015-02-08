package applimedical.sighal.dto;

import applimedical.sighal.api.constantes.DomaineEnum;

public class FichePatientGeneraleDto extends FichePatientDto {

	private String description;

	private DomaineEnum domaine;
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DomaineEnum getDomaine() {
		return domaine;
	}

	public void setDomaine(DomaineEnum domaine) {
		this.domaine = domaine;
	}

}