package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.TypeDeSoin;

public interface TypeDeSoinRepository 
   extends CrudRepository<TypeDeSoin, Long>, JpaRepository<TypeDeSoin, Long> {
}