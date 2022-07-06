package ci.gs2e.dpi.inventor.magasin.domain.dto;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class MagasinDto implements Serializable {
    private long id;
    private String code;
    @JsonProperty("nomMagasin")
    private String libelle;
    private Entrepot entrepot;
    private Localisation localisation;
}
