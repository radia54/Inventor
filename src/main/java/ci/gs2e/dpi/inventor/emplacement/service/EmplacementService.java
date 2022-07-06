package ci.gs2e.dpi.inventor.emplacement.service;

import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.domain.dto.EmplacementDto;
import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;

import java.util.List;

public interface EmplacementService {
    List<EmplacementDto> getAll();
    EmplacementDto create(EmplacementDto emplacementDto);
    Emplacement getById(long id);
    Emplacement getByName(String name);
    //delete
    //update
}
