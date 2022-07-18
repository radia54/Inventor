package ci.gs2e.dpi.inventor.MaterielEmploye.service;

import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.dto.MaterielEmplacementDto;
import ci.gs2e.dpi.inventor.MaterielEmploye.domain.MaterielEmploye;
import ci.gs2e.dpi.inventor.MaterielEmploye.domain.dto.MaterielEmployeDto;

import java.util.List;

public interface MaterielEmployeService {
    List<MaterielEmployeDto> getAll();
    MaterielEmployeDto create(MaterielEmployeDto materielEmployeDto);
    MaterielEmploye getById(long id);
    //MaterielEmploye getByName(String name);
    void delete(long id);
    MaterielEmployeDto update(MaterielEmployeDto materielEmployeDto, long id);
}
