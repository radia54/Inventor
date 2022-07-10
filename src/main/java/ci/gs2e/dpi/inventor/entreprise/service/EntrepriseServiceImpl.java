package ci.gs2e.dpi.inventor.entreprise.service;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.entreprise.domain.dto.EntrepriseDto;
import ci.gs2e.dpi.inventor.entreprise.repository.EntrepriseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntrepriseServiceImpl implements EntrepriseService{

    EntrepriseRepository entrepriseRepository;
    @Override
    public List<EntrepriseDto> getAll() {
        return null;
    }

    @Override
    public EntrepriseDto create(EntrepriseDto entreprise) {
        return null;
    }

    @Override
    public Entreprise getById(long id) {
        return null;
    }
/*
    @Override
    public Entreprise getByName(String name) {
        return null;
    }

 */
}
