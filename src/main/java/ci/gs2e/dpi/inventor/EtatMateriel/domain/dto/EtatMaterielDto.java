package ci.gs2e.dpi.inventor.EtatMateriel.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EtatMaterielDto implements Serializable {
    private  long id;
    private String libelle;
}
