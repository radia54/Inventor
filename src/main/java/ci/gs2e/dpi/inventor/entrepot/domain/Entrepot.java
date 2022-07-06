package ci.gs2e.dpi.inventor.entrepot.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "entrepots")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entrepot extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code", length = 10)
    private String code;

    @Column(name = "libelle", length = 100)
    private String libelle;

}
