package applimedical.sighal.api.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fournisseur")
public class Fournisseur extends Personne {

   @Column(name = "raison_social")
   private String raisonSocial;

   @Column()
   private String remarque;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "fournisseur", fetch=FetchType.LAZY)
   private List<Commande> commandeList;

   public String getRaisonSocial() {
      return raisonSocial;
   }

   public void setRaisonSocial(String raisonSocial) {
      this.raisonSocial = raisonSocial;
   }

   public String getRemarque() {
      return remarque;
   }

   public void setRemarque(String remarque) {
      this.remarque = remarque;
   }

   public List<Commande> getCommandeList() {
      return commandeList;
   }

   public void setCommandeList(List<Commande> commandeList) {
      this.commandeList = commandeList;
   }
}