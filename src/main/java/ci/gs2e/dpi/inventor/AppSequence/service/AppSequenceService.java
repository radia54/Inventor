package ci.gs2e.dpi.inventor.AppSequence.service;

import ci.gs2e.dpi.inventor.AppSequence.domain.AppSequence;
import ci.gs2e.dpi.inventor.AppSequence.domain.dto.AppSequenceDto;
import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;

import java.util.List;

public interface AppSequenceService {
    List<AppSequenceDto> getAll();
    AppSequenceDto create(AppSequenceDto appSequenceDto);
    AppSequence getById(long id);
    AppSequence getByName(String name);
    void delete(long id);
    AppSequenceDto update(AppSequenceDto appSequenceDto, long id);
}
