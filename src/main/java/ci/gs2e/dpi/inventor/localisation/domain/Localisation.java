package ci.gs2e.dpi.inventor.localisation.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="localisations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Localisation extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "localisation_magasin", length = 100)
    private String localisation_magasin;
}
