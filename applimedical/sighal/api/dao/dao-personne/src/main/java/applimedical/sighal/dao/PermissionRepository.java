package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Permission;

public interface PermissionRepository 
   extends CrudRepository<Permission, Long>, JpaRepository<Permission, Long> {
}