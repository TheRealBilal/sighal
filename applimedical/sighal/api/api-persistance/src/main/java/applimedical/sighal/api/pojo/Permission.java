package applimedical.sighal.api.pojo;

/***********************************************************************
 * Module:  permission.java
 * Author:  HAZEM
 * Purpose: Defines the Class permission
 ***********************************************************************/

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import applimedical.sighal.api.constantes.DroitEnum;
import applimedical.sighal.pojo.BasePojo;

@Entity
public class Permission extends BasePojo {
   @Column()
   private String description;

   @Enumerated(EnumType.ORDINAL)
   @Column()
   private DroitEnum droit;

   @Column(name = "date_debut")
   private Date dateDebut;

   @Column(name = "date_fin")
   private Date dateFin;

   @OneToMany(mappedBy = "permission")
   private List<RelFctModulePerm> listRelFctModulePerm;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public DroitEnum getDroit() {
      return droit;
   }

   public void setDroit(DroitEnum droit) {
      this.droit = droit;
   }

   public Date getDateDebut() {
      return dateDebut;
   }

   public void setDateDebut(Date dateDebut) {
      this.dateDebut = dateDebut;
   }

   public Date getDateFin() {
      return dateFin;
   }

   public void setDateFin(Date dateFin) {
      this.dateFin = dateFin;
   }

   public List<RelFctModulePerm> getListRelFctModulePerm() {
      return listRelFctModulePerm;
   }

   public void setListRelFctModulePerm(
         List<RelFctModulePerm> listRelFctModulePerm) {
      this.listRelFctModulePerm = listRelFctModulePerm;
   }

}