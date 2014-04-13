package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

public class PersonnelDto extends PersonneDto {

	private String matricule;

	private Date dateEmbauche;

	private Integer experience;

	private Double salaire;

	private List<PersonnelServiceDto> personnelServiceDtoList;

	private List<QualificationDto> qualificationDtoList;

	private List<RendezVousDto> rendezVousArrangeDtoList;

   private List<RendezVousDto> rendezVousPourDtoList;

	public List<PersonnelServiceDto> getPersonnelServiceDtoList() {
		return personnelServiceDtoList;
	}

	public void setPersonnelServiceDtoList(List<PersonnelServiceDto> personnelServiceDtoList) {
		this.personnelServiceDtoList = personnelServiceDtoList;
	}

	public List<QualificationDto> getQualificationDtoList() {
		return qualificationDtoList;
	}

	public void setQualificationDtoList(List<QualificationDto> qualificationDtoList) {
		this.qualificationDtoList = qualificationDtoList;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

   public List<RendezVousDto> getRendezVousArrangeDtoList() {
      return rendezVousArrangeDtoList;
   }

   public void setRendezVousArrangeDtoList(List<RendezVousDto> rendezVousArrangeDtoList) {
      this.rendezVousArrangeDtoList = rendezVousArrangeDtoList;
   }

   public List<RendezVousDto> getRendezVousPourDtoList() {
      return rendezVousPourDtoList;
   }

   public void setRendezVousPourDtoList(List<RendezVousDto> rendezVousPourDtoList) {
      this.rendezVousPourDtoList = rendezVousPourDtoList;
   }
}