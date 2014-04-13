package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Qualification;

public interface QualificationRepository 
   extends CrudRepository<Qualification, Long>, JpaRepository<Qualification, Long> {
}