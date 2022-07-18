package ci.gs2e.dpi.inventor.MaterielEmplacement;

import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielEmplacementRepository extends JpaRepository<MaterielEmplacement, Long> {
}
