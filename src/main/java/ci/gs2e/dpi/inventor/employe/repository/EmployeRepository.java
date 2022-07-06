package ci.gs2e.dpi.inventor.employe.repository;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
    Optional<Employe> findByMatricule(String matricule);
}
