package ci.gs2e.dpi.inventor.entreprise.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entreprise extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "raison_sociale", length = 30)
    private String raison_sociale;
    @Column(name = "adresse", length = 25)
    private String adresse;
}
