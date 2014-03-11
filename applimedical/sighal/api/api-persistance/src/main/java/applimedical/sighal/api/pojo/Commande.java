package applimedical.sighal.api.pojo;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "commande_id")
   private Long commandeId;

   @Column(name = "date_commande")
   private Date dateComande;

   @Column(name = "date_entree_souhaitee")
   private Date dateEntreeSouhaitee;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande", fetch=FetchType.LAZY)
   public Collection<BonEntree> bonEntreeList;

   @OneToMany()
   private Collection<LigneCommande> ligneCommandeList;

   @ManyToOne()
   @JoinColumn(name = "fournisseur_id", referencedColumnName = "personne_id")
   private Fournisseur fournisseur;

   public Long getCommandeId() {
      return commandeId;
   }

   public void setCommandeId(Long commandeId) {
      this.commandeId = commandeId;
   }

   public Date getDateComande() {
      return dateComande;
   }

   public void setDateComande(Date dateComande) {
      this.dateComande = dateComande;
   }

   public Date getDateEntreeSouhaitee() {
      return dateEntreeSouhaitee;
   }

   public void setDateEntreeSouhaitee(Date dateEntreeSouhaitee) {
      this.dateEntreeSouhaitee = dateEntreeSouhaitee;
   }

   public Collection<BonEntree> getBonEntreeList() {
      return bonEntreeList;
   }

   public void setBonEntreeList(Collection<BonEntree> bonEntreeList) {
      this.bonEntreeList = bonEntreeList;
   }

   public Collection<LigneCommande> getLigneCommandeList() {
      return ligneCommandeList;
   }

   public void setLigneCommandeList(Collection<LigneCommande> ligneCommandeList) {
      this.ligneCommandeList = ligneCommandeList;
   }

   public Fournisseur getFournisseur() {
      return fournisseur;
   }

   public void setFournisseur(Fournisseur fournisseur) {
      this.fournisseur = fournisseur;
   }
}