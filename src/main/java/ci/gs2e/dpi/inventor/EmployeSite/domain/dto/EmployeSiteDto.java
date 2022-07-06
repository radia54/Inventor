package ci.gs2e.dpi.inventor.EmployeSite.domain.dto;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class EmployeSiteDto implements Serializable {

    private long id;
    //@JsonProperty("localisation_site")
    private String localisation_site;
    private String localisation_complete_site;
    private Entreprise entreprise;
}
