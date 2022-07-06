package ci.gs2e.dpi.inventor.emplacement.domain.dto;

import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class EmplacementDto implements Serializable {
    private long id;
    private String code;
    @JsonProperty("libelle")
    private String libelle;
    private Magasin magasin;
}
