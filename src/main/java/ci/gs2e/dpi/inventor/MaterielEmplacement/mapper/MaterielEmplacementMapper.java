package ci.gs2e.dpi.inventor.MaterielEmplacement.mapper;

import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.dto.MaterielEmplacementDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.mapper.TypeFournisseurMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring")
public interface MaterielEmplacementMapper {
    MaterielEmplacementMapper INSTANCE = Mappers.getMapper( MaterielEmplacementMapper.class);

    //@Mapping(source = "libelle", target = "libelle")
    MaterielEmplacementDto fromMaterielEmplacement(MaterielEmplacement materielEmplacement);

   // @Mapping(source = "libelle", target = "libelle")
    MaterielEmplacement fromMaterielEmplacementDto(MaterielEmplacementDto materielEmplacementDto);

   // @Mapping(source = "libelle", target = "liibelle")
    List<MaterielEmplacementDto> fromMaterielEmplacementList(List<MaterielEmplacement> materielEmplacementList);
    //@Mapping(source = "libelle", target = "libelle")
    List<MaterielEmplacement> fromMaterielEmplacementDtoList(List<MaterielEmplacementDto> materielEmplacementDtoList);
}
