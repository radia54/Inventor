package ci.gs2e.dpi.inventor.TypeMateriel.mapper;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.mapper.TypeFournisseurMapper;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.dto.TypeMaterielDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeMaterielMapper {
    TypeMaterielMapper INSTANCE = Mappers.getMapper( TypeMaterielMapper.class);

    @Mapping(source = "libelle", target = "libelle")
    TypeMaterielDto fromTypeMateriel(TypeMateriel typeMateriel);

    @Mapping(source = "libelle", target = "libelle")
    TypeMateriel fromTypeMaterielDto(TypeMaterielDto typeMaterielDto);

    @Mapping(source = "libelle", target = "liibelle")
    List<TypeMaterielDto> fromTypeMaterielList(List<TypeMateriel> typeMaterielList);
    @Mapping(source = "libelle", target = "libelle")
    List<TypeMateriel> fromTypeMaterielDtoList(List<TypeMaterielDto> typeMaterielDtoList);
}
