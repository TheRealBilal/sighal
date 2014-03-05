package applimedical.sighal.api.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
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
}