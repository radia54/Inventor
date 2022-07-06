package ci.gs2e.dpi.inventor.magasin.mapper;

import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import ci.gs2e.dpi.inventor.localisation.domain.dto.LocalisationDto;
import ci.gs2e.dpi.inventor.localisation.mapper.LocalisationMapper;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MagasinMapper {
    MagasinMapper INSTANCE = Mappers.getMapper( MagasinMapper.class);

    @Mapping(source = "libelle", target = "libelle")
    MagasinDto fromMagasin(Magasin magasin);

    @Mapping(source = "libelle", target = "libelle")
    Magasin fromMagasinDto(MagasinDto magasinDto);

    @Mapping(source = "libelle", target = "liibelle")
    List<MagasinDto> fromMagasinList(List<Magasin> magasinList);
    @Mapping(source = "libelle", target = "libelle")
    List<Magasin> fromMagasinDtoList(List<MagasinDto> magasiinDtoList);



}
