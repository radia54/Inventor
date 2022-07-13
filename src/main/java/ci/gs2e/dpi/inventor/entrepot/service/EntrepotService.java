package ci.gs2e.dpi.inventor.entrepot.service;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;

import java.util.List;

public interface EntrepotService {

    List<EntrepotDto> getAll();
    EntrepotDto create(EntrepotDto entrepot);
    Entrepot getById(long id);
    Entrepot getByName(String name);
    EntrepotDto update( EntrepotDto entrepotDto, long id);
    void delete(long id);
}
