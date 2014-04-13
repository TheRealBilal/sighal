package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import applimedical.sighal.api.pojo.PersonnelService;
import applimedical.sighal.api.pojo.PersonnelServicePk;

public interface PersonnelServiceRepository 
   extends CrudRepository<PersonnelService, PersonnelServicePk>, JpaRepository<PersonnelService, PersonnelServicePk> {
}