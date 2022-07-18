package ci.gs2e.dpi.inventor.MaterielEmplacement.service;

import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.dto.MaterielEmplacementDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;

import java.util.List;

public interface MaterielEmplacementService {
    List<MaterielEmplacementDto> getAll();
    MaterielEmplacementDto create(MaterielEmplacementDto materielEmplacementDto);
    MaterielEmplacement getById(long id);
    //MaterielEmplacement getByName(String name);
    void delete(long id);
    MaterielEmplacementDto update(MaterielEmplacementDto materielEmplacementDto, long id);
}
