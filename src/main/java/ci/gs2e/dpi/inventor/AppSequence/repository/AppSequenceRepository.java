package ci.gs2e.dpi.inventor.AppSequence.repository;

import ci.gs2e.dpi.inventor.AppSequence.domain.AppSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppSequenceRepository extends JpaRepository<AppSequence, Long> {

    Optional<AppSequence> findByPrefixe(String prefixe);
}
