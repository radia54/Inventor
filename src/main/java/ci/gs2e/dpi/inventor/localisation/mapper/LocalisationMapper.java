package ci.gs2e.dpi.inventor.localisation.mapper;

import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import ci.gs2e.dpi.inventor.localisation.domain.dto.LocalisationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocalisationMapper {
    LocalisationMapper INSTANCE = Mappers.getMapper( LocalisationMapper.class);

    @Mapping(source = "localisation_magasin", target = "localisation_mag")
    LocalisationDto fromLocalisation(Localisation localisation);

    @Mapping(source = "localisation_mag", target = "localisation_magasin")
    Localisation fromLocalisationDto(LocalisationDto localisationDto);

    @Mapping(source = "localisation_magasin", target = "localisation_mag")
    List<LocalisationDto> fromLocalisationList(List<Localisation> localisationList);
    @Mapping(source = "localisation_mag", target = "localisation_magasin")
    List<Localisation> fromLocalisationDtoList(List<LocalisationDto> localisationDtoList);



}
