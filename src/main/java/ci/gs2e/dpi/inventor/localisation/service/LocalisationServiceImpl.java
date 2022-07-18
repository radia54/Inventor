package ci.gs2e.dpi.inventor.localisation.service;

import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import ci.gs2e.dpi.inventor.localisation.domain.dto.LocalisationDto;
import ci.gs2e.dpi.inventor.localisation.mapper.LocalisationMapper;
import ci.gs2e.dpi.inventor.localisation.repository.LocalisationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class LocalisationServiceImpl implements LocalisationService{

    LocalisationRepository localisationRepository;
    @Override
    public List<LocalisationDto> getAll() {
        return LocalisationMapper.INSTANCE.fromLocalisationList(localisationRepository.findAll());
    }

    @Override
    public LocalisationDto create(LocalisationDto localisation) {
        return  LocalisationMapper.INSTANCE.fromLocalisation(localisationRepository.save(LocalisationMapper.INSTANCE.fromLocalisationDto(localisation)));
    }

    @Override
    public Localisation getById(long id) {
        return  localisationRepository.findById(id).get();
    }

    @Override
    public LocalisationDto update(LocalisationDto localisationDto, long id) {
        LocalisationDto localisationDto1=LocalisationMapper.INSTANCE.fromLocalisation(localisationRepository.findById(id).get());
        if (Objects.nonNull(localisationDto.getLocalisation_mag())){
            localisationDto1.setLocalisation_mag(localisationDto.getLocalisation_mag());
        }

        return LocalisationMapper.INSTANCE.fromLocalisation(localisationRepository.save(LocalisationMapper.INSTANCE.fromLocalisationDto(localisationDto1)));

    }

    @Override
    public void delete(long id) {
        localisationRepository.deleteById(id);

    }
/*
    @Override
    public Localisation getByName(String name) {
        return localisationRepository.findByLocalisation_magasin(name);
    }
*/

}
