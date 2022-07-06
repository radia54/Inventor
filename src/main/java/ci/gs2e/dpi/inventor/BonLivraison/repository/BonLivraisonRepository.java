package ci.gs2e.dpi.inventor.BonLivraison.repository;

import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BonLivraisonRepository extends JpaRepository<BonLivraison, Long> {
}
