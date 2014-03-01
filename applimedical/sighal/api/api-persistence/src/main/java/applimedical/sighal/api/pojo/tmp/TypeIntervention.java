package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  TypeIntervention.java
 * Author:  HAZEM
 * Purpose: Defines the Class TypeIntervention
 ***********************************************************************/

import java.util.*;

/** @pdOid 6fbdc2e2-bb75-49f2-b849-5193c9ea0fc3 */
public class TypeIntervention {
   /** @pdOid d134155e-6b09-477e-911d-43e6903b293d */
   private String codeTypeInterv;
   /** @pdOid cfc4f016-2182-48a9-940d-456ec688c175 */
   private String nomTypeInterv;
   /** @pdOid 6026b5c8-cfb4-4632-827d-80c266fb72a7 */
   private String descTypeInterv;
   
   /** @pdRoleInfo migr=no name=Intervention assc=Association_19 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Intervention intervention;

}