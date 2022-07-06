package ci.gs2e.dpi.inventor.EmployeSite.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SiteEmploye")
public class EmployeSite extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String localisation_site;
    private String localisation_site_complete;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "entreprise_id", nullable=false)
    private Entreprise entreprise;


}
