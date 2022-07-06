package ci.gs2e.dpi.inventor.localisation.repository;

import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalisationRepository extends JpaRepository<Localisation, Long> {

    //Localisation findByLocalisation_magasin(String localisation_magasin);
}
