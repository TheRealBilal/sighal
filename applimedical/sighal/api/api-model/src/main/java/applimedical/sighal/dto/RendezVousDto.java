package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;
import applimedical.sighal.api.constantes.EtatRdvEnum;

public class RendezVousDto {

	private Long rendezVousId;

	private Date datePriseRdv;

	private Date dateRdv;

	private PatientDto patientDto;

   private List<PersonnelDto> personnelDtoList;

	private PersonnelDto personnelDto;

	private InterventionDto interventionDto;

	private SalleDto salleDto;
	
	private EtatRdvEnum etat;

   public Long getRendezVousId() {
      return rendezVousId;
   }

   public void setRendezVousId(Long rendezVousId) {
      this.rendezVousId = rendezVousId;
   }

   public Date getDatePriseRdv() {
      return datePriseRdv;
   }

   public void setDatePriseRdv(Date datePriseRdv) {
      this.datePriseRdv = datePriseRdv;
   }

   public Date getDateRdv() {
      return dateRdv;
   }

   public void setDateRdv(Date dateRdv) {
      this.dateRdv = dateRdv;
   }

   public List<PersonnelDto> getPersonnelDtoList() {
      return personnelDtoList;
   }

   public void setPersonnelDtoList(List<PersonnelDto> personnelDtoList) {
      this.personnelDtoList = personnelDtoList;
   }

   public PatientDto getPatientDto() {
      return patientDto;
   }

   public void setPatientDto(PatientDto patientDto) {
      this.patientDto = patientDto;
   }

   public PersonnelDto getPersonnelDto() {
      return personnelDto;
   }

   public void setPersonnelDto(PersonnelDto personnelDto) {
      this.personnelDto = personnelDto;
   }

   public InterventionDto getInterventionDto() {
      return interventionDto;
   }

   public void setInterventionDto(InterventionDto interventionDto) {
      this.interventionDto = interventionDto;
   }

   public SalleDto getSalleDto() {
      return salleDto;
   }

   public void setSalleDto(SalleDto salleDto) {
      this.salleDto = salleDto;
   }

   public EtatRdvEnum getEtat() {
      return etat;
   }

   public void setEtat(EtatRdvEnum etat) {
      this.etat = etat;
   }
}