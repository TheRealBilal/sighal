package applimedical.sighal.api.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "ligne_sortie")
public class LigneSortie extends BasePojo {

	@Column(name = "quantite_sortie")
	private Integer quantiteSortie;

	@Column(name = "date_sortie")
	private Date dateSortie;

	@ManyToOne()
	@JoinColumn(name="produit_id", referencedColumnName="id")
	private Produit produit;

	@ManyToOne()
   @JoinColumn(name="intervention_id", referencedColumnName="id")
	private Intervention intervention;

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