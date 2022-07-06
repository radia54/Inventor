package ci.gs2e.dpi.inventor.EtatMateriel.service;

import ci.gs2e.dpi.inventor.EtatMateriel.domain.EtatMateriel;
import ci.gs2e.dpi.inventor.EtatMateriel.domain.dto.EtatMaterielDto;

import java.util.List;

public interface EtatMaterielService {
    List<EtatMaterielDto> getAll();
    EtatMaterielDto create(EtatMaterielDto etatMaterielDto);
    EtatMateriel getById(long id);
    EtatMateriel getByName(String name);
}
