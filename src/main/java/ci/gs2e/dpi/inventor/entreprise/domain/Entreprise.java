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
@Table(name = "entreprise")
public class Entreprise extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "raisonsociale", length = 30)
    private String raisonsociale;

    @Column(name = "addresse", length = 25)
    private String addresse;
}
