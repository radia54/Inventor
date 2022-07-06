package ci.gs2e.dpi.inventor.magasin.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "magasin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magasin extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code", length = 10)
    private String code;

    @Column(name = "libelle", length = 100)
    private String libelle;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "entrepot_id", nullable = false)
    private Entrepot entrepot;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="localisation_id" , nullable = false)
    private Localisation localisation;

}
