package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import applimedical.sighal.api.pojo.RelFctModulePerm;
import applimedical.sighal.api.pojo.RelFctModulePerm.RelFctModulePermPK;

public interface RelFctModulePermRepository 
   extends CrudRepository<RelFctModulePerm, RelFctModulePermPK>, JpaRepository<RelFctModulePerm, RelFctModulePermPK> {
}