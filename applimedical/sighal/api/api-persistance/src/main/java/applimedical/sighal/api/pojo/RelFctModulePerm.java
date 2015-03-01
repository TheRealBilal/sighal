package applimedical.sighal.api.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import applimedical.sighal.api.pojo.RelFctModulePerm.RelFctModulePermPK;

@Entity
@Table(name = "rel_fct_module_perm")
@IdClass(RelFctModulePermPK.class)
public class RelFctModulePerm {
	@Id
	@Column(name = "fonction_id", insertable= false, updatable = false)
	private Long fonctionId;
	@Id
	@Column(name = "permission_id", insertable= false, updatable = false)
	private Long permissionId;
	@Id
	@Column(name = "module_id", insertable= false, updatable = false)
	private Long moduleId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name ="permission_id" , referencedColumnName ="id")
	private Permission permission;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name ="module_id" , referencedColumnName ="id")
	private Module module;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name ="id" , referencedColumnName ="id")
	private Fonction fonction;

	@Temporal (TemporalType.TIMESTAMP)
	@Column(name = "date_debut")
	private Date dateDebut;

	@Temporal (TemporalType.TIMESTAMP)
	@Column(name = "date_fin")
	private Date dateFin;

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}



	public class RelFctModulePermPK implements Serializable{

/**
		 * 
		 */
		private static final long serialVersionUID = -6759392055564613703L;

		//		@Column(name = "fonction_id")
//		@JoinColumn(name = "fonction_id", table = "fonction")
		private Long fonctionId;

//		@JoinColumn(name = "permission_id", table = "permission")
//		@Column(name = "permission_id")
		private Long permissionId;

//		@JoinColumn(name = "module_id", table = "module")
//		@Column(name = "module_id")
		private Long moduleId;

		public Long getFonctionId() {
			return fonctionId;
		}
		public void setFonctionId(Long fonctionId) {
			this.fonctionId = fonctionId;
		}

		public Long getPermissionId() {
			return permissionId;
		}
		public void setPermissionId(Long permissionId) {
			this.permissionId = permissionId;
		}
		public Long getModuleId() {
			return moduleId;
		}
		public void setModuleId(Long moduleId) {
			this.moduleId = moduleId;
		}

	   /**
	    * (non-Javadoc)
	    * @see java.lang.Object#equals(java.lang.Object)
	    */
	   @Override
	   public boolean equals(Object obj) {
	      if (this == obj)
	         return true;
	      if (obj == null)
	         return false;
	      if (getClass() != obj.getClass())
	         return false;
	      RelFctModulePermPK other = (RelFctModulePermPK) obj;
	      if (fonctionId != other.fonctionId)
	         return false;
         if (permissionId != other.permissionId)
            return false;
	      if (moduleId != other.moduleId)
	         return false;
	      return true;
	   }

	   @Override
	   public int hashCode() {
	      return ((fonctionId == null) ? 0 : fonctionId.hashCode())
	            ^ ((permissionId == null) ? 0 : permissionId.hashCode())
	            ^ ((moduleId == null) ? 0 : moduleId.hashCode());
	   }
	}
}
