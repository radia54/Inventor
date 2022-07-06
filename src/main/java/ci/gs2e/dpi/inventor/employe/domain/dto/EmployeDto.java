package ci.gs2e.dpi.inventor.employe.domain.dto;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class EmployeDto implements Serializable {
    private long id;
    @JsonProperty("matricule")
    private String matricule;
    private String nom;
    private String prenom;
    private EmployeSite employeSite;
}
