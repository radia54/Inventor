package ci.gs2e.dpi.inventor.TypeMateriel.service;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.dto.TypeMaterielDto;

import java.util.List;

public interface TypeMaterielService {
    List<TypeMaterielDto> getAll();
    TypeMaterielDto create(TypeMaterielDto typeMaterielDto);
    TypeMateriel getById(long id);
    TypeMateriel getByName(String name);
    void delete(long id);
    TypeMaterielDto update(TypeMaterielDto typeMaterielDto, long id);
}
