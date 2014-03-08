package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  __enumeration__Domaine.java
 * Author:  HAZEM
 * Purpose: Defines the Class __enumeration__Domaine
 ***********************************************************************/

import java.util.*;

import applimedical.sighal.api.pojo.FichePatientGenerale;

/** @pdOid 4f772f03-24ac-48fe-b708-206089d1f0c4 */
public class DomaineEnum {
   /** @pdOid 833fdbb0-23fe-49cf-9a19-d1b1476d8a5f */
   private String cardiopathie;
   /** @pdOid fc86f6ba-4a86-484b-9e39-4b57da85ad3c */
   private String hta;
   /** @pdOid c7ecd1ca-c607-4252-8052-b6c3c1bf8dbc */
   private String diabete;
   /** @pdOid 71807757-51f8-4da6-a13e-c4078d57df21 */
   private String autre;
   
   /** @pdRoleInfo migr=no name=FichePatientGenerale assc=Association_26 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<FichePatientGenerale> fichePatientGenerale;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<FichePatientGenerale> getFichePatientGenerale() {
      if (fichePatientGenerale == null)
         fichePatientGenerale = new java.util.HashSet<FichePatientGenerale>();
      return fichePatientGenerale;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFichePatientGenerale() {
      if (fichePatientGenerale == null)
         fichePatientGenerale = new java.util.HashSet<FichePatientGenerale>();
      return fichePatientGenerale.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFichePatientGenerale */
   public void setFichePatientGenerale(java.util.Collection<FichePatientGenerale> newFichePatientGenerale) {
      removeAllFichePatientGenerale();
      for (java.util.Iterator iter = newFichePatientGenerale.iterator(); iter.hasNext();)
         addFichePatientGenerale((FichePatientGenerale)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFichePatientGenerale */
   public void addFichePatientGenerale(FichePatientGenerale newFichePatientGenerale) {
      if (newFichePatientGenerale == null)
         return;
      if (this.fichePatientGenerale == null)
         this.fichePatientGenerale = new java.util.HashSet<FichePatientGenerale>();
      if (!this.fichePatientGenerale.contains(newFichePatientGenerale))
         this.fichePatientGenerale.add(newFichePatientGenerale);
   }
   
   /** @pdGenerated default remove
     * @param oldFichePatientGenerale */
   public void removeFichePatientGenerale(FichePatientGenerale oldFichePatientGenerale) {
      if (oldFichePatientGenerale == null)
         return;
      if (this.fichePatientGenerale != null)
         if (this.fichePatientGenerale.contains(oldFichePatientGenerale))
            this.fichePatientGenerale.remove(oldFichePatientGenerale);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFichePatientGenerale() {
      if (fichePatientGenerale != null)
         fichePatientGenerale.clear();
   }

}