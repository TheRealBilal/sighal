package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  __enumeration__EtatRdv.java
 * Author:  HAZEM
 * Purpose: Defines the Class __enumeration__EtatRdv
 ***********************************************************************/

import java.util.*;

import applimedical.sighal.api.pojo.Rdv;

/** @pdOid 4647cb09-0845-4fce-a97c-5653e525846f */
public class EtatRdvEnum {
   /** @pdOid 62dc4aef-c191-4280-827b-8bcc94f7ad75 */
   private String initie;
   /** @pdOid ba1b6f3b-f9b5-4119-a260-7679c74414b3 */
   private String valide;
   /** @pdOid 62aed105-a6be-40e9-9bb7-ffad45d989b6 */
   private String annuler;
   
   /** @pdRoleInfo migr=no name=Rdv assc=Association_18 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Rdv rdv;

}