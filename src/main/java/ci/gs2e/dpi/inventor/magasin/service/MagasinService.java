package ci.gs2e.dpi.inventor.magasin.service;

import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;

import java.util.List;

public interface MagasinService {

    List<MagasinDto> getAll();
    MagasinDto create(MagasinDto magasin);
    Magasin getById(long id);
    Magasin getByName(String name);
    //delete
    //update

}
