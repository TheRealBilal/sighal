package applimedical.sighal.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import applimedical.sighal.dto.PersonnelDto;

public class SighalAuthentication extends UsernamePasswordAuthenticationToken {
    private static final long serialVersionUID = -3790889120475758453L;
    private PersonnelDto utilisateur;

    public SighalAuthentication(PersonnelDto utilisateur, Object principal, Object credentials,
            Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
        this.utilisateur = utilisateur;
    }

    public PersonnelDto getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(PersonnelDto utilisateur) {
        this.utilisateur = utilisateur;
    }
}
