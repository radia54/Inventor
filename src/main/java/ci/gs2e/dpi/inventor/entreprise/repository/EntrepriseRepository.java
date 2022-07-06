package ci.gs2e.dpi.inventor.entreprise.repository;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    //Optional<Entreprise> findByRaison_sociale(String raison_sociale);
}
