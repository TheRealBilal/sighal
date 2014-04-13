package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Soin;

public interface SoinRepository 
   extends CrudRepository<Soin, Long>, JpaRepository<Soin, Long> {
}