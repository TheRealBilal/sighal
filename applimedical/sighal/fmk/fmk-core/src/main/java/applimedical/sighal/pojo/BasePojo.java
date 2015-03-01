package applimedical.sighal.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BasePojo {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   protected Long Id;

   public Long getId() {
      return Id;
   }

   public void setId(Long id) {
      Id = id;
   }
}
