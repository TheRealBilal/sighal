package applimedical.sighal.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import applimedical.sighal.business.PersonneBusiness;
import applimedical.sighal.dto.PersonnelDto;

@Component("authenticationProvider")
public class SighalAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    @Qualifier("personneBusiness")
    private PersonneBusiness personneBusiness;

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        PersonnelDto utilisateur = personneBusiness.chargerPersonnel(username);

        if (utilisateur == null) {
            throw new BadCredentialsException("Utilisateur non reconnnu.");
        }

        if (!password.equals(utilisateur.getMotDePasse())) {
            throw new BadCredentialsException("Utilisateur et/ou mot de passe erronés.");
        }

        // Spring voter requires the roles to be prefixed with "ROLE_"
        // There is another way to but it's way more complicated :s
        //Enumeration<? extends Group> userGroups =  utilisateur.groups();
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        /*while (userGroups.hasMoreElements()) {
            Group userGroup = userGroups.nextElement();
            if (userGroup instanceof Role) {
                grantedAuthorities.add(
                        new SimpleGrantedAuthority(Constants.ROLE_PREFIX + userGroup.getName().toUpperCase()));
            }
        }*/
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + utilisateur.getFonctionDto().getNomFonction().toUpperCase()));

        return new SighalAuthentication(utilisateur, username, password,
                grantedAuthorities);
    }

    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }
}
