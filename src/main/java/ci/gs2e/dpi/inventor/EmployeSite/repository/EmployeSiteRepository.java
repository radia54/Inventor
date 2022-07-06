package ci.gs2e.dpi.inventor.EmployeSite.repository;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeSiteRepository extends JpaRepository<EmployeSite, Long> {
    //Optional<EmployeSite> findByLocalisation_site(String localisation_site);

}
