package ci.gs2e.dpi.inventor.TypeMateriel.repository;

import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeMaterielRepository extends JpaRepository<TypeMateriel, Long> {

    Optional<TypeMateriel> findByLibelle(String libelle);
}
