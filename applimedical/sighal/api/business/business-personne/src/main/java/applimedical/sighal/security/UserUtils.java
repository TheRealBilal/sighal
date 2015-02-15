package applimedical.sighal.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import applimedical.sighal.api.pojo.Personnel;
import applimedical.sighal.dto.PersonnelDto;

public abstract class UserUtils {

    /*public static PersonnelDto utilisateurCourant() {
        return ((SighalAuthentication) SecurityContextHolder.getContext().getAuthentication()).getUtilisateur();
    }*/
    
    public static Personnel utilisateurCourant() {
        return ((SighalAuthentication) SecurityContextHolder.getContext().getAuthentication()).getUtilisateur();
    }
    public static boolean isAuthentifie() {
       return SecurityContextHolder.getContext().getAuthentication() instanceof SighalAuthentication;
   }

   public static boolean hasAnyRole(String ...roles) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        for (String role:roles) {
            for (GrantedAuthority grantedAuthority:auth.getAuthorities()) {   
                String roleWithoutPrefix
                    = grantedAuthority.getAuthority().substring("ROLE_".length());
                if (role.equalsIgnoreCase(roleWithoutPrefix)) {
                    return true;
                }
            }
        }
        return false;
    }
}
