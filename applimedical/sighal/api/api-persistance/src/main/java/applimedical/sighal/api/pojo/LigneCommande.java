package applimedical.sighal.api.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_commande")
public class LigneCommande {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ligne_commande_id")
   private Long ligneCommandeId;

   @ManyToOne()
   @JoinColumn(name = "commande_id", referencedColumnName = "commande_id")
   private Commande commande;

   @ManyToOne()
   @JoinColumn(name = "produit_id", referencedColumnName = "produit_id")
   private Produit produit;

   @Column()
   private int quantite;

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

   public int getQuantite() {
      return quantite;
   }

   public void setQuantite(int quantite) {
      this.quantite = quantite;
   }

   public Double getPrix() {
      return prix;
   }

   public void setPrix(Double prix) {
      this.prix = prix;
   }
}