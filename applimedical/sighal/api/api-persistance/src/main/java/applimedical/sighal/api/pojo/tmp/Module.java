package applimedical.sighal.api.pojo.tmp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Module {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "module_id")
	private Long moduleId;

	@Column(name ="nom_module")
	private String nom;

	@Column ()
	private String description;

	@Column()
	private Boolean active;

}