package ci.gs2e.dpi.inventor.entreprise.service;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.EmployeSite.domain.dto.EmployeSiteDto;
import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.entreprise.domain.dto.EntrepriseDto;

import java.util.List;

public interface EntrepriseService {
    List<EntrepriseDto> getAll();
    EntrepriseDto create(EntrepriseDto entreprise);
    Entreprise getById(long id);
    // Entreprise getByName(String name);
    //update
    //delete
}
