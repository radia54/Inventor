package ci.gs2e.dpi.inventor.MaterielEmplacement.domain.dto;

import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MaterielEmplacementDto implements Serializable {
    private long id;
    private Date DateDebut;
    private Date DateFin;
    private Emplacement emplacement;
    private Materiel materiel;
}
