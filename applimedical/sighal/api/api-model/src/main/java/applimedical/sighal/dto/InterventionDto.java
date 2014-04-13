package applimedical.sighal.dto;

import java.util.*;

public class InterventionDto {
	private Long interventionId;

	private Date dateIntervention;

	private Integer dureeIntervention;

	private String description;

	private TypeInterventionDto typeInterventionDto;

	private FichePatientDto fichePatientDto;

   private List<SoinDto> soinDtoList;

   private List<LigneSortieDto> ligneSortieDtoList;

	private RendezVousDto rendezVousDto;

   public Long getInterventionId() {
      return interventionId;
   }

   public void setInterventionId(Long interventionId) {
      this.interventionId = interventionId;
   }

   public Date getDateIntervention() {
      return dateIntervention;
   }

   public void setDateIntervention(Date dateIntervention) {
      this.dateIntervention = dateIntervention;
   }

   public Integer getDureeIntervention() {
      return dureeIntervention;
   }

   public void setDureeIntervention(Integer dureeIntervention) {
      this.dureeIntervention = dureeIntervention;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public TypeInterventionDto getTypeInterventionDto() {
      return typeInterventionDto;
   }

   public void setTypeInterventionDto(TypeInterventionDto typeInterventionDto) {
      this.typeInterventionDto = typeInterventionDto;
   }

   public FichePatientDto getFichePatientDto() {
      return fichePatientDto;
   }

   public void setFichePatientDto(FichePatientDto fichePatientDto) {
      this.fichePatientDto = fichePatientDto;
   }

   public List<SoinDto> getSoinDtoList() {
      return soinDtoList;
   }

   public void setSoinDtoList(List<SoinDto> soinDtoList) {
      this.soinDtoList = soinDtoList;
   }

   public List<LigneSortieDto> getLigneSortieDtoList() {
      return ligneSortieDtoList;
   }

   public void setLigneSortieDtoList(List<LigneSortieDto> ligneSortieDtoList) {
      this.ligneSortieDtoList = ligneSortieDtoList;
   }

   public RendezVousDto getRendezVousDto() {
      return rendezVousDto;
   }

   public void setRendezVousDto(RendezVousDto rendezVousDto) {
      this.rendezVousDto = rendezVousDto;
   }
}