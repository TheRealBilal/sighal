package applimedical.sighal.api.pojo;

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
@Table(name = "bon_entree")
public class BonEntree {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "bon_entree_id")
   private Long bonEntreeId;
   @Column(name = "date_entree")
   private Date dateEntree;
   @Column(name = "prix_global")
   private Double prixGlobal;

   @ManyToOne()
   @JoinColumn(name = "commande_id", referencedColumnName = "commande_id")
   private Commande commande;

   public Long getBonEntreeId() {
      return bonEntreeId;
   }
   public void setBonEntreeId(Long bonEntreeId) {
      this.bonEntreeId = bonEntreeId;
   }
   public Date getDateEntree() {
      return dateEntree;
   }
   public void setDateEntree(Date dateEntree) {
      this.dateEntree = dateEntree;
   }
   public Double getPrixGlobal() {
      return prixGlobal;
   }
   public void setPrixGlobal(Double prixGlobal) {
      this.prixGlobal = prixGlobal;
   }
   public Commande getCommande() {
      return commande;
   }
   public void setCommande(Commande commande) {
      this.commande = commande;
   }
}