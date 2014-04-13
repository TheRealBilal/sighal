package applimedical.sighal.dto;

import java.io.Serializable;
import java.util.Date;

public class RelFctModulePermDto implements Serializable {

   private static final long serialVersionUID = -170458352109152920L;

   private Long fonctionId;

	private Long permissionId;

	private Long moduleId;
	
	private PermissionDto permissionDto;

	private ModuleDto moduleDto;

	private FonctionDto fonctionDto;

	private Date dateDebut;

	private Date dateFin;

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

   public PermissionDto getPermissionDto() {
		return permissionDto;
	}

	public void setPermissionDto(PermissionDto permissionDto) {
		this.permissionDto = permissionDto;
	}

	public ModuleDto getModuleDto() {
		return moduleDto;
	}

	public void setModuleDto(ModuleDto moduleDto) {
		this.moduleDto = moduleDto;
	}

	public FonctionDto getFonctionDto() {
		return fonctionDto;
	}

	public void setFonctionDto(FonctionDto fonctionDto) {
		this.fonctionDto = fonctionDto;
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
}
