package ci.gs2e.dpi.inventor.TypeFournisseur.repository;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeFournisseurRepository extends JpaRepository<TypeFournisseur, Long> {

    Optional<TypeFournisseur> findByLibelle(String libelle);
}
