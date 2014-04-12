package applimedical.sighal.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "salle")
public class Salle {

   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "salle_id")
   private Long salleId;

   @Column (name ="nom_salle")
   private String nomSalle;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "salle", fetch=FetchType.LAZY)
   private List<RendezVous> rendezVousList;
   
   public Long getSalleId() {
      return salleId;
   }

   public void setSalleId(Long salleId) {
      this.salleId = salleId;
   }

   public String getNomSalle() {
      return nomSalle;
   }

   public void setNomSalle(String nomSalle) {
      this.nomSalle = nomSalle;
   }

   public List<RendezVous> getRendezVousList() {
      return rendezVousList;
   }

   public void setRendezVousList(List<RendezVous> rendezVousList) {
      this.rendezVousList = rendezVousList;
   }
}