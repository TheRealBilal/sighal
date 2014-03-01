package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  Soin.java
 * Author:  HAZEM
 * Purpose: Defines the Class Soin
 ***********************************************************************/

import java.util.*;

/** @pdOid c3dfc9cc-a360-4fe9-a686-db4114ba9819 */
public class Soin {
   /** @pdOid 10e3c6eb-5108-4dbe-9fad-e20125023504 */
   private String identifient;
   /** @pdOid d41ef40e-55b9-4905-8b3b-60f8055e2975 */
   private String typeSoin;
   /** @pdOid 4146d3cd-313f-483d-af6e-22a0c80a03d8 */
   private int descriptionSoin;
   
   /** @pdRoleInfo migr=no name=membre_organe_ assc=Association_34 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<MembreOrgane> membre_organe_;
   /** @pdRoleInfo migr=no name=typeDeSoin assc=Association_35 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TypeDeSoin> typeDeSoin;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<MembreOrgane> getMembre_organe_() {
      if (membre_organe_ == null)
         membre_organe_ = new java.util.HashSet<MembreOrgane>();
      return membre_organe_;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMembre_organe_() {
      if (membre_organe_ == null)
         membre_organe_ = new java.util.HashSet<MembreOrgane>();
      return membre_organe_.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMembre_organe_ */
   public void setMembre_organe_(java.util.Collection<MembreOrgane> newMembre_organe_) {
      removeAllMembre_organe_();
      for (java.util.Iterator iter = newMembre_organe_.iterator(); iter.hasNext();)
         addMembre_organe_((MembreOrgane)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMembre_organe_ */
   public void addMembre_organe_(MembreOrgane newMembre_organe_) {
      if (newMembre_organe_ == null)
         return;
      if (this.membre_organe_ == null)
         this.membre_organe_ = new java.util.HashSet<MembreOrgane>();
      if (!this.membre_organe_.contains(newMembre_organe_))
         this.membre_organe_.add(newMembre_organe_);
   }
   
   /** @pdGenerated default remove
     * @param oldMembre_organe_ */
   public void removeMembre_organe_(MembreOrgane oldMembre_organe_) {
      if (oldMembre_organe_ == null)
         return;
      if (this.membre_organe_ != null)
         if (this.membre_organe_.contains(oldMembre_organe_))
            this.membre_organe_.remove(oldMembre_organe_);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMembre_organe_() {
      if (membre_organe_ != null)
         membre_organe_.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<TypeDeSoin> getTypeDeSoin() {
      if (typeDeSoin == null)
         typeDeSoin = new java.util.HashSet<TypeDeSoin>();
      return typeDeSoin;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTypeDeSoin() {
      if (typeDeSoin == null)
         typeDeSoin = new java.util.HashSet<TypeDeSoin>();
      return typeDeSoin.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTypeDeSoin */
   public void setTypeDeSoin(java.util.Collection<TypeDeSoin> newTypeDeSoin) {
      removeAllTypeDeSoin();
      for (java.util.Iterator iter = newTypeDeSoin.iterator(); iter.hasNext();)
         addTypeDeSoin((TypeDeSoin)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTypeDeSoin */
   public void addTypeDeSoin(TypeDeSoin newTypeDeSoin) {
      if (newTypeDeSoin == null)
         return;
      if (this.typeDeSoin == null)
         this.typeDeSoin = new java.util.HashSet<TypeDeSoin>();
      if (!this.typeDeSoin.contains(newTypeDeSoin))
         this.typeDeSoin.add(newTypeDeSoin);
   }
   
   /** @pdGenerated default remove
     * @param oldTypeDeSoin */
   public void removeTypeDeSoin(TypeDeSoin oldTypeDeSoin) {
      if (oldTypeDeSoin == null)
         return;
      if (this.typeDeSoin != null)
         if (this.typeDeSoin.contains(oldTypeDeSoin))
            this.typeDeSoin.remove(oldTypeDeSoin);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTypeDeSoin() {
      if (typeDeSoin != null)
         typeDeSoin.clear();
   }

}