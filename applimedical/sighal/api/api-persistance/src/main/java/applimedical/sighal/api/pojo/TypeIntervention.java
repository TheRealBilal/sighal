package applimedical.sighal.api.pojo;

import java.util.Collection;

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
@Table(name ="type_intervention")
public class TypeIntervention {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "type_intervention_id")
   private Long typeIntervId;

   @Column()
   private String nom;

   @Column()
   private String description;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeIntervention", fetch=FetchType.LAZY)
   public Collection<Intervention> interventions;

   public Long getTypeIntervId() {
      return typeIntervId;
   }

   public void setTypeIntervId(Long typeIntervId) {
      this.typeIntervId = typeIntervId;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Collection<Intervention> getInterventions() {
      return interventions;
   }

   public void setInterventions(Collection<Intervention> interventions) {
      this.interventions = interventions;
   }
}