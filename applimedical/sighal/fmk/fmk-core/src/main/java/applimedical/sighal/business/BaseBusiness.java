package applimedical.sighal.business;

import java.io.Serializable;
import java.util.List;

public interface BaseBusiness <ENTITY, ID extends Serializable>{
   List<ENTITY> findAll();
   ENTITY findById(ID id);
   ENTITY saveOrUpdate(ENTITY entity);
   void delete(ID id);
}
