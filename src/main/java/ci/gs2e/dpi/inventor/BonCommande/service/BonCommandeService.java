package ci.gs2e.dpi.inventor.BonCommande.service;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.domain.dto.EmplacementDto;

import java.util.List;

public interface BonCommandeService {
    List<BonCommandeDto> getAll();
    BonCommandeDto create(BonCommandeDto bonCommandeDto);
    BonCommande getById(long id);
    //BonCommande getByName(String name);
    void delete(long id);
    BonCommandeDto update(BonCommandeDto bonCommande, long id);
}
