package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Service;

public interface ServiceRepository 
   extends CrudRepository<Service, Long>, JpaRepository<Service, Long> {
}