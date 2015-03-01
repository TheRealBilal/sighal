package applimedical.sighal.business;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class BaseBusinessImpl<ENTITY, ID extends Serializable>
   implements BaseBusiness<ENTITY, ID> {
   @Autowired
   protected JpaRepository<ENTITY, ID> mainRep;

   @Transactional(readOnly=true)
   public List<ENTITY> findAll() {
      return mainRep.findAll();
   }
   @Transactional(readOnly=true)
   public ENTITY findById(ID id) {
      return mainRep.findOne(id);
   }
   public void delete(ID id) {
      mainRep.delete(id);
   }
   @Override
   public ENTITY saveOrUpdate(ENTITY entity) {
      return mainRep.save(entity);
   }
}
