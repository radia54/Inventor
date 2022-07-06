package ci.gs2e.dpi.inventor.AppSequence.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "App_Sequence")
public class AppSequence extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "prefixe", length = 15)
    private String prefixe;
    @Column(name = "next", length = 15)
    private int next;
}
