package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Module;

public interface ModuleRepository 
   extends CrudRepository<Module, Long>, JpaRepository<Module, Long> {
}