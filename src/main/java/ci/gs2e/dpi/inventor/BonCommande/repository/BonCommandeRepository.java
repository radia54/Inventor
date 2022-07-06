package ci.gs2e.dpi.inventor.BonCommande.repository;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BonCommandeRepository extends JpaRepository<BonCommande, Long> {

    //Optional<BonCommande> findByCode(Integer code);
}
