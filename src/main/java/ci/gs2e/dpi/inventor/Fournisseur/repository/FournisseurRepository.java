package ci.gs2e.dpi.inventor.Fournisseur.repository;

import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

    Optional<Fournisseur> findByNom(String nom);
}
