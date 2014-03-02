package applimedical.sighal.api.pojo.tmp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salle")
public class Salle {

   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "num")
   private Long numSalle;

   public Long getNumSalle() {
      return numSalle;
   }

   public void setNumSalle(Long numSalle) {
      this.numSalle = numSalle;
   }

   public String getNomSalle() {
      return nomSalle;
   }

   public void setNomSalle(String nomSalle) {
      this.nomSalle = nomSalle;
   }

   @Column (name ="nom_salle")
   private String nomSalle;

}