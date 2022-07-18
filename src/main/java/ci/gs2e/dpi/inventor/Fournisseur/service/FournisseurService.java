package ci.gs2e.dpi.inventor.Fournisseur.service;

import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;


import java.util.List;

public interface FournisseurService {
    List<FournisseurDto> getAll();
    FournisseurDto create(FournisseurDto fournisseur);
    Fournisseur getById(long id);
    Fournisseur getByName(String name);
    void delete(long id);
    FournisseurDto update(FournisseurDto fournisseurDto, long id);
}
