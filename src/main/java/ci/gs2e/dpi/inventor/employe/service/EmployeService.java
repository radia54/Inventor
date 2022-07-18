package ci.gs2e.dpi.inventor.employe.service;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;

import java.util.List;

public interface EmployeService {
    List<EmployeDto> getAll();
    EmployeDto create(EmployeDto employe);
    Employe getById(long id);
    Employe getByName(String name);
    void delete(long id);
    EmployeDto update(EmployeDto employeDto, long id);
}
