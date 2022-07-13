package ci.gs2e.dpi.inventor.entreprise.repository;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    //Entreprise findByRaisonsociale(String raisonsociale);
}
