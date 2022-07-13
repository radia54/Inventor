package ci.gs2e.dpi.inventor.entrepot.domain.dto;


import lombok.Data;


import java.io.Serializable;

@Data
public class EntrepotDto implements Serializable {

    private long id;

    private String code;

    //@JsonProperty("libelle")
    private String libelle;
}
