package ci.gs2e.dpi.inventor.emplacement.repository;

import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmplacementRepository extends JpaRepository<Emplacement, Long> {
    Optional<Emplacement> findByLibelle(String libelle);
}
