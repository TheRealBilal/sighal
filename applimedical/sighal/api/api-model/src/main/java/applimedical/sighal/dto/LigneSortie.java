package applimedical.sighal.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_sortie")
public class LigneSortie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ligne_sortie_id")
	private Long ligneSortieId;

	@Column(name = "quantite_sortie")
	private Integer quantiteSortie;

	@Column(name = "date_sortie")
	private Date dateSortie;

	@ManyToOne()
	@JoinColumn(name="produit_id", referencedColumnName="produit_id")
	private Produit produit;

	@ManyToOne()
   @JoinColumn(name="intervention_id", referencedColumnName="intervention_id")
	private Intervention intervention;
	
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

   public Produit getProduit() {
      return produit;
   }

   public void setProduit(Produit produit) {
      this.produit = produit;
   }

   public Intervention getIntervention() {
      return intervention;
   }

   public void setIntervention(Intervention intervention) {
      this.intervention = intervention;
   }
}