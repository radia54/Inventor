package ci.gs2e.dpi.inventor.MaterielEmploye.domain;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Materiel_Employe")
public class MaterielEmploye {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "DateDebutAffectation", length = 10)
    private Date DateDebutAffectation;
    @Column(name = "DateFinAffectation", length = 10)
    private Date DateFinAffectation;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Materiel_id", nullable = false)
    private Materiel materiel;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Employe_id", nullable = false)
    private Employe employe;

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
