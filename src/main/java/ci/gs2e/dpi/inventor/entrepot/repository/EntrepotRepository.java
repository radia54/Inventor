package ci.gs2e.dpi.inventor.entrepot.repository;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EntrepotRepository extends JpaRepository<Entrepot, Long> {

    Entrepot findByLibelle(String libelle);
}
