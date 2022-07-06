package ci.gs2e.dpi.inventor.materiel.mapper;

import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import ci.gs2e.dpi.inventor.materiel.domain.dto.MaterielDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterielMapper {
    MaterielMapper INSTANCE = Mappers.getMapper( MaterielMapper.class);

    @Mapping(source = "libelle", target = "libelle")
    MaterielDto fromMateriel(Materiel materiel);

    @Mapping(source = "libelle", target = "libelle")
    Materiel fromMaterielDto(MaterielDto materielDto);

    @Mapping(source = "libelle", target = "liibelle")
    List<MaterielDto> fromMaterielList(List<Materiel> materielList);
    @Mapping(source = "libelle", target = "libelle")
    List<Materiel> fromMaterielDtoList(List<MaterielDto> materielDtoList);

}
