package ci.gs2e.dpi.inventor.BonCommande.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BonCommande extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "numero_bon_commande", length = 20)
    private int numero_bon_commande;
}
