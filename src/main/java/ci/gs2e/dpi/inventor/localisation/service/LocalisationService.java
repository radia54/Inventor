package ci.gs2e.dpi.inventor.localisation.service;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;
import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import ci.gs2e.dpi.inventor.localisation.domain.dto.LocalisationDto;

import java.util.List;

public interface LocalisationService {
    List<LocalisationDto> getAll();
    LocalisationDto create(LocalisationDto localisation);
    Localisation getById(long id);

   //Localisation getByName(String name);
    //update
    //delete
}
