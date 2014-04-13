package applimedical.sighal.dto;

import java.util.Date;

public class LigneSortieDto {

   private Long ligneSortieId;

	private Integer quantiteSortie;

	private Date dateSortie;

	private ProduitDto produitDto;

	private InterventionDto interventionDto;
	
	public Long getLigneSortieId() {
		return ligneSortieId;
	}

	public void setLigneSortieId(Long ligneSortieId) {
		this.ligneSortieId = ligneSortieId;
	}

	public Integer getQuantiteSortie() {
		return quantiteSortie;
	}

	public void setQuantiteSortie(Integer quantiteSortie) {
		this.quantiteSortie = quantiteSortie;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

   public ProduitDto getProduitDto() {
      return produitDto;
   }

   public void setProduitDto(ProduitDto produitDto) {
      this.produitDto = produitDto;
   }

   public InterventionDto getIntervention() {
      return interventionDto;
   }

   public void setInterventionDto(InterventionDto interventionDto) {
      this.interventionDto = interventionDto;
   }
}