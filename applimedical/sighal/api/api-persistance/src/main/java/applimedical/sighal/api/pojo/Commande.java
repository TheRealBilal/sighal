package applimedical.sighal.api.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "commande")
public class Commande extends BasePojo {

   @Column(name = "date_commande")
   private Date dateComande;

   @Column(name = "date_entree_souhaitee")
   private Date dateEntreeSouhaitee;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande", fetch=FetchType.LAZY)
   private List<BonEntree> bonEntreeList;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande", fetch=FetchType.LAZY)
   private List<LigneCommande> ligneCommandeList;

   @ManyToOne()
   @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
   private Fournisseur fournisseur;

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

   public List<BonEntree> getBonEntreeList() {
      return bonEntreeList;
   }

   public void setBonEntreeList(List<BonEntree> bonEntreeList) {
      this.bonEntreeList = bonEntreeList;
   }

   public List<LigneCommande> getLigneCommandeList() {
      return ligneCommandeList;
   }

   public void setLigneCommandeList(List<LigneCommande> ligneCommandeList) {
      this.ligneCommandeList = ligneCommandeList;
   }

   public Fournisseur getFournisseur() {
      return fournisseur;
   }

   public void setFournisseur(Fournisseur fournisseur) {
      this.fournisseur = fournisseur;
   }
}