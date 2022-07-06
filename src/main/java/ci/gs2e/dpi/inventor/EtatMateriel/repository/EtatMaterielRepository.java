package ci.gs2e.dpi.inventor.EtatMateriel.repository;

import ci.gs2e.dpi.inventor.EtatMateriel.domain.EtatMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtatMaterielRepository extends JpaRepository<EtatMateriel, Long> {
    @Override
    Optional<EtatMateriel> findById(Long id);
    Optional<EtatMateriel> findByLibelle(String libelle);

}
