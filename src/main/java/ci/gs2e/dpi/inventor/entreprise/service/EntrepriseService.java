package ci.gs2e.dpi.inventor.entreprise.service;



import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.entreprise.domain.dto.EntrepriseDto;

import java.util.List;

public interface EntrepriseService {
    List<EntrepriseDto> getAll();
    EntrepriseDto create(EntrepriseDto entreprise);
    Entreprise getById(long id);
   // Entreprise getByName(String name);
    EntrepriseDto update(EntrepriseDto entrepriseDto, long id);
    void delete(long id);
}
