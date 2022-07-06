package ci.gs2e.dpi.inventor.entreprise.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class EntrepriseDto {
    private long id;
    @JsonProperty("raison_sociale")
    private String nomEntreprise;
    private String adresse;

}
