package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import applimedical.sighal.api.pojo.Personnel;

public interface PersonnelRepository 
   extends CrudRepository<Personnel, Long>, JpaRepository<Personnel, Long> {
	
	Personnel findByLogin(String  login);
}