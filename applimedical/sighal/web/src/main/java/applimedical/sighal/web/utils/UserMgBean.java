package applimedical.sighal.web.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import applimedical.sighal.security.UserUtils;

@Component("userBean")
@Scope("application")
public class UserMgBean {

   public boolean isAuthentifie() {
      return UserUtils.isAuthentifie();
   }

   public boolean hasRole(String role) {
       return hasAnyRole(role);
   }

   public boolean hasAnyRole(String ...roles) {
       return UserUtils.hasAnyRole(roles);
   }

   public String getUsername() {
       return UserUtils.utilisateurCourant().getLogin();
   }

   public String getPrenom() {
       return UserUtils.utilisateurCourant().getPrenom();
   }

   public String getNom() {
       return UserUtils.utilisateurCourant().getNom();
   }

   public String getEmail() {
       return UserUtils.utilisateurCourant().getEmail();
   }

  public List<String> getRoles() {
     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     List<String> roles = new ArrayList<String>(auth.getAuthorities().size());
     for (GrantedAuthority grantedAuthority : auth.getAuthorities()) {
        roles.add(grantedAuthority.getAuthority());
     }
     return roles;
  }

}
