package ci.gs2e.dpi.inventor.EmployeSite.service;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.EmployeSite.domain.dto.EmployeSiteDto;


import java.util.List;

public interface EmployeSiteService {
    List<EmployeSiteDto> getAll();
    EmployeSiteDto create(EmployeSiteDto employeSite);
    EmployeSite getById(long id);
   // EmployeSite getByName(String name);
    //update
    //delete
}
