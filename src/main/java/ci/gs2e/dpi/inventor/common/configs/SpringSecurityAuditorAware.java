package ci.gs2e.dpi.inventor.common.configs;

import lombok.extern.slf4j.Slf4j;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Slf4j
public class SpringSecurityAuditorAware implements AuditorAware<String> {

  @Autowired
  private HttpServletRequest request;


  @Override
  public Optional<String> getCurrentAuditor() {

    KeycloakAuthenticationToken token = (KeycloakAuthenticationToken) request.getUserPrincipal();
    KeycloakPrincipal principal=(KeycloakPrincipal)token.getPrincipal();
    KeycloakSecurityContext session = principal.getKeycloakSecurityContext();
    AccessToken accessToken = session.getToken();
    return Optional.ofNullable(accessToken.getPreferredUsername()).filter(s -> !s.isEmpty());
  }
}
