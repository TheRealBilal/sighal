package applimedical.sighal.api.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "patient")
public class Patient extends Personne {
   @Column()
   private String matricule;

   @Column()
   private Double poid;

   @Column()
   private Double taille;

   @Column()
   private Boolean antecedents;

   @Column()
   private String commentaire;

   @OneToMany(cascade=CascadeType.ALL, mappedBy="patient",fetch=FetchType.LAZY)
   private List<RendezVous> rendezVousList;

   @OneToOne(cascade = CascadeType.ALL )
   @JoinColumn(name="id")
   private DossierPatient dossierPatient;
   
   @ManyToOne()
   @JoinColumn(name = "commande_id", referencedColumnName = "id")
   private Commande commande;

   public String getMatricule() {
      return matricule;
   }

   public void setMatricule(String matricule) {
      this.matricule = matricule;
   }

   public Double getPoid() {
      return poid;
   }

   public void setPoid(Double poid) {
      this.poid = poid;
   }

   public Double getTaille() {
      return taille;
   }

   public void setTaille(Double taille) {
      this.taille = taille;
   }

   public Boolean getAntecedents() {
      return antecedents;
   }

   public void setAntecedents(Boolean antecedents) {
      this.antecedents = antecedents;
   }

   public String getCommentaire() {
      return commentaire;
   }

   public void setCommentaire(String commentaire) {
      this.commentaire = commentaire;
   }

   public List<RendezVous> getRendezVousList() {
      return rendezVousList;
   }

   public void setRendezVousList(List<RendezVous> rendezVousList) {
      this.rendezVousList = rendezVousList;
   }

   public DossierPatient getDossierPatient() {
      return dossierPatient;
   }

   public void setDossierPatient(DossierPatient dossierPatient) {
      this.dossierPatient = dossierPatient;
   }

   public Commande getCommande() {
      return commande;
   }

   public void setCommande(Commande commande) {
      this.commande = commande;
   }
}