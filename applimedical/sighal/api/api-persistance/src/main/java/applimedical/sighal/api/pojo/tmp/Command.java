package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  Command.java
 * Author:  HAZEM
 * Purpose: Defines the Class Command
 ***********************************************************************/

import java.util.*;

/** @pdOid 94591e63-e8a3-4265-a86d-1712e11b1136 */
public class Command {
   /** @pdOid 2c9e509b-9f3e-4374-9ba1-863fd001d03a */
   private int dateComand;
   /** @pdOid 415b794e-0dfd-4706-a2ea-92c67a3ea9c6 */
   private int dateEntreeSouhaitee;
   
   /** @pdRoleInfo migr=no name=BonEntree assc=Association_30 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<BonEntree> bonEntree;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<BonEntree> getBonEntree() {
      if (bonEntree == null)
         bonEntree = new java.util.HashSet<BonEntree>();
      return bonEntree;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBonEntree() {
      if (bonEntree == null)
         bonEntree = new java.util.HashSet<BonEntree>();
      return bonEntree.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBonEntree */
   public void setBonEntree(java.util.Collection<BonEntree> newBonEntree) {
      removeAllBonEntree();
      for (java.util.Iterator iter = newBonEntree.iterator(); iter.hasNext();)
         addBonEntree((BonEntree)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBonEntree */
   public void addBonEntree(BonEntree newBonEntree) {
      if (newBonEntree == null)
         return;
      if (this.bonEntree == null)
         this.bonEntree = new java.util.HashSet<BonEntree>();
      if (!this.bonEntree.contains(newBonEntree))
         this.bonEntree.add(newBonEntree);
   }
   
   /** @pdGenerated default remove
     * @param oldBonEntree */
   public void removeBonEntree(BonEntree oldBonEntree) {
      if (oldBonEntree == null)
         return;
      if (this.bonEntree != null)
         if (this.bonEntree.contains(oldBonEntree))
            this.bonEntree.remove(oldBonEntree);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBonEntree() {
      if (bonEntree != null)
         bonEntree.clear();
   }

}