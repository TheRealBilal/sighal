package applimedical.sighal.dto;

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
   private CommandeDto commande;

   @ManyToOne()
   @JoinColumn(name = "produit_id", referencedColumnName = "produit_id")
   private Produit produit;

   @Column()
   private Integer quantite;

   @Column()
   private Double prix;

   public CommandeDto getCommande() {
      return commande;
   }

   public void setCommande(CommandeDto commande) {
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