package ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class TypeFournisseurDto implements Serializable {
    private long id;
    @JsonProperty("libelle")
    private String libelle;

}
