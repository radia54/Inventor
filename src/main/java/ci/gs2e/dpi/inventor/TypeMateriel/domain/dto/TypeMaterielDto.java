package ci.gs2e.dpi.inventor.TypeMateriel.domain.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class TypeMaterielDto implements Serializable {
    private long id;
    private String code;
    private String libelle;
}
