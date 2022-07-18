package ci.gs2e.dpi.inventor.MaterielEmploye.repository;

import ci.gs2e.dpi.inventor.MaterielEmploye.domain.MaterielEmploye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielEmployeRepository extends JpaRepository<MaterielEmploye, Long> {
}
