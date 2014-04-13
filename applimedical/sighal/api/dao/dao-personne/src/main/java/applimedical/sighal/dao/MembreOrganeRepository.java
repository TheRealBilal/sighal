package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.MembreOrgane;

public interface MembreOrganeRepository 
   extends CrudRepository<MembreOrgane, Long>, JpaRepository<MembreOrgane, Long> {
}