package applimedical.sighal.web.admin;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import applimedical.sighal.api.pojo.Permission;
import applimedical.sighal.business.PermissionBusiness;

@Controller("permBean")
@Scope("session")
public class PermissionBean implements Serializable{
   private static final long serialVersionUID = -181031459270687339L;

   @Autowired
   private PermissionBusiness permissionBusiness;

   private Permission selectedPojo;
	private List<Permission> permissions;

   @PostConstruct
   public void init() {
      selectedPojo = null;
      permissions = permissionBusiness.findAll();
   }

   public void initAdd() {
      selectedPojo = new Permission();      
   }
   public void onSaveAdd(ActionEvent ev) {
      permissionBusiness.saveOrUpdate(selectedPojo);
      selectedPojo = null;
      permissions = permissionBusiness.findAll();
   }
   public List<Permission> getPermissions() {
      return permissions;
   }
   public Permission getSelectedPojo() {
      return selectedPojo;
   }

   public void setSelectedPojo(Permission selectedPojo) {
      this.selectedPojo = selectedPojo;
   }

}
