package applimedical.sighal.api.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}