package ci.gs2e.dpi.inventor.localisation.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class LocalisationDto implements Serializable {
    private long id;

    @JsonProperty("localisation_magasin")
    private String localisation_mag;
}
