package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  typeDeSoin.java
 * Author:  HAZEM
 * Purpose: Defines the Class typeDeSoin
 ***********************************************************************/

import java.util.*;

/** @pdOid 826a01a7-15e9-454f-aac4-f0ffed275f11 */
public class TypeDeSoin {
   /** @pdOid d68b47b5-01e0-46d9-b464-1f0c6c8d1d17 */
   private String codeType;
   /** @pdOid 033a425a-da85-401c-b353-1076ed1769d9 */
   private String nomType;
   /** @pdOid 805b04bf-0140-4df6-ba74-8731db4974b8 */
   private int categorieType;
   /** @pdOid d7b1fea6-d816-4cea-aaf5-bed32e61439b */
   private int descriptionType;
   
   /** @pdRoleInfo migr=no name=Soin assc=Association_31 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Soin> soin;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Soin> getSoin() {
      if (soin == null)
         soin = new java.util.HashSet<Soin>();
      return soin;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSoin() {
      if (soin == null)
         soin = new java.util.HashSet<Soin>();
      return soin.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSoin */
   public void setSoin(java.util.Collection<Soin> newSoin) {
      removeAllSoin();
      for (java.util.Iterator iter = newSoin.iterator(); iter.hasNext();)
         addSoin((Soin)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSoin */
   public void addSoin(Soin newSoin) {
      if (newSoin == null)
         return;
      if (this.soin == null)
         this.soin = new java.util.HashSet<Soin>();
      if (!this.soin.contains(newSoin))
         this.soin.add(newSoin);
   }
   
   /** @pdGenerated default remove
     * @param oldSoin */
   public void removeSoin(Soin oldSoin) {
      if (oldSoin == null)
         return;
      if (this.soin != null)
         if (this.soin.contains(oldSoin))
            this.soin.remove(oldSoin);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSoin() {
      if (soin != null)
         soin.clear();
   }

}