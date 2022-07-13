package ci.gs2e.dpi.inventor.entreprise.domain.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class EntrepriseDto implements Serializable {

    private long id;
    private String raisonsociale;
    private String addresse;

}
