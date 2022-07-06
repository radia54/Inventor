package ci.gs2e.dpi.inventor.magasin.repository;

import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MagasinRepository extends JpaRepository<Magasin, Long> {

    Optional<Magasin> findByCode(String code);
    Optional<Magasin> findByLibelle(String name);
}
