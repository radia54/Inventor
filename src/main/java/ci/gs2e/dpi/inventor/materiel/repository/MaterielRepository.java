package ci.gs2e.dpi.inventor.materiel.repository;

import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Long> {

    Optional<Materiel> findByLibelle(String libelle);
}
