package ci.gs2e.dpi.inventor.BonLivraison.service;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.BonLivraison.domain.dto.BonLivraisonDto;

import java.util.List;

public interface BonLivraisonService {
    List<BonLivraisonDto> getAll();
    BonLivraisonDto create(BonLivraisonDto bonLivraisonDto);
    BonLivraison getById(long id);
    //BonCommande getByName(String name);
    void delete(long id);
    BonLivraisonDto update(BonLivraisonDto bonLivraisonDto, long id);
}
