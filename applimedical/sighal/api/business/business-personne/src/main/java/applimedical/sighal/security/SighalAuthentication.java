package applimedical.sighal.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import applimedical.sighal.api.pojo.Personnel;

public class SighalAuthentication extends UsernamePasswordAuthenticationToken {
    private static final long serialVersionUID = -3790889120475758453L;
    private Personnel utilisateur;

    public SighalAuthentication(Personnel utilisateur, Object principal, Object credentials,
            Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
        this.utilisateur = utilisateur;
    }

    public Personnel getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Personnel utilisateur) {
        this.utilisateur = utilisateur;
    }
}
