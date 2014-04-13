package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Document;

public interface DocumentRepository 
   extends CrudRepository<Document, Long>, JpaRepository<Document, Long> {
}