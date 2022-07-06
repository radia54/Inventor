package ci.gs2e.dpi.inventor.TypeFournisseur.service;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;

import java.util.List;

public interface TypeFournisseurService {
    List<TypeFournisseurDto> getAll();
    TypeFournisseurDto create(TypeFournisseurDto typeFournisseurDto);
    TypeFournisseur getById(long id);
    TypeFournisseur getByName(String name);
    //delete
    //update

}
