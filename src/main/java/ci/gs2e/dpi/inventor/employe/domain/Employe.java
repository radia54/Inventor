package ci.gs2e.dpi.inventor.employe.domain;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employe extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="matricule", length = 25)
    private String matricule;
    @Column(name="nom", length = 50)
    private String nom;
    @Column(name = "prenom", length = 50)
    private String prenom;
@ManyToOne(fetch = FetchType.EAGER, optional = false)
@JoinColumn(name = "employesite_id", nullable = false)
    private EmployeSite employesite;


}
