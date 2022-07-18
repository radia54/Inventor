package ci.gs2e.dpi.inventor.materiel.service;

import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import ci.gs2e.dpi.inventor.materiel.domain.dto.MaterielDto;

import java.util.List;

public interface MaterielService {
    List<MaterielDto> getAll();
    MaterielDto create(MaterielDto materielDto);
    Materiel getById(long id);
    Materiel getByName(String name);
    void delete(long id);
    MaterielDto update(MaterielDto materielDto, long id);
}
