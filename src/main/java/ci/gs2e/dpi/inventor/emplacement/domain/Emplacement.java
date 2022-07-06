package ci.gs2e.dpi.inventor.emplacement.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emplacement extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="code" ,length=20)
    private String code;
    @Column(name = "libelle", length = 25)
    private String libelle;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Magasin_id", nullable = false)
    private Magasin magasin;
}
