package ci.gs2e.dpi.inventor.entrepot.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class EntrepotDto implements Serializable {

    private long id;
    @JsonProperty("code")
    private String code;

    //@JsonProperty("libelle")
    private String nomEntrepot;
}
