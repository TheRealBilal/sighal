package applimedical.sighal.api.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "ligne_commande")
public class LigneCommande extends BasePojo {

   @ManyToOne()
   @JoinColumn(name = "commande_id", referencedColumnName = "id")
   private Commande commande;

   @ManyToOne()
   @JoinColumn(name = "produit_id", referencedColumnName = "id")
   private Produit produit;

   @Column()
   private Integer quantite;

   @Column()
   private Double prix;

   public Commande getCommande() {
      return commande;
   }

   public void setCommande(Commande commande) {
      this.commande = commande;
   }

   public Produit getProduit() {
      return produit;
   }

   public void setProduit(Produit produit) {
      this.produit = produit;
   }

   public Integer getQuantite() {
      return quantite;
   }

   public void setQuantite(Integer quantite) {
      this.quantite = quantite;
   }

   public Double getPrix() {
      return prix;
   }

   public void setPrix(Double prix) {
      this.prix = prix;
   }
}