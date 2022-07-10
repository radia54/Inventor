package ci.gs2e.dpi.inventor.MaterielEmplacement.domain;

import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Materiel_Emplacement")
public class MaterielEmplacement extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "DateDebut", length = 10)
    private Date DateDebut;
    @Column(name = "DateFin", length = 10)
    private Date DateFin;
    @Column(name = "observation" , length = 30)
    private String observation;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "materiel_id", nullable = false)
    private Materiel materiel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Emplacement_id")
    private Emplacement emplacement;

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookPublisher)) return false;
        BookPublisher that = (BookPublisher) o;
        return Objects.equals(book.getName(), that.book.getName()) &&
                Objects.equals(publisher.getName(), that.publisher.getName()) &&
                Objects.equals(publishedDate, that.publishedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book.getName(), publisher.getName(), publishedDate);
    }
     */

}
