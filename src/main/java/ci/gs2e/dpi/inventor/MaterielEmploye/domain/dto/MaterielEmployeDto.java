package ci.gs2e.dpi.inventor.MaterielEmploye.domain.dto;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MaterielEmployeDto implements Serializable {
    private long id;
    private Date DateDebutAffectation;
    private Date DateFinAffectation;
    private Materiel materiel;
    private Employe employe;
}
