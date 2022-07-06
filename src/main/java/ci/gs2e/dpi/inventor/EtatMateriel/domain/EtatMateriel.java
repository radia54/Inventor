package ci.gs2e.dpi.inventor.EtatMateriel.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtatMateriel extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "libelle", length = 20)
    private  String libelle;
}
