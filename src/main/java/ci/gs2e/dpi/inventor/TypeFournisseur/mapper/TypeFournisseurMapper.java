package ci.gs2e.dpi.inventor.TypeFournisseur.mapper;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeFournisseurMapper {
    TypeFournisseurMapper INSTANCE = Mappers.getMapper( TypeFournisseurMapper.class);

    @Mapping(source = "libelle", target = "libelle")
    TypeFournisseurDto fromTypeFournisseur(TypeFournisseur typeFournisseur);

    @Mapping(source = "libelle", target = "libelle")
    TypeFournisseur fromTypeFournisseurDto(TypeFournisseurDto typeFournisseurDto);

    @Mapping(source = "libelle", target = "liibelle")
    List<TypeFournisseurDto> fromTypeFournisseurList(List<TypeFournisseur> typeFournisseurList);
    @Mapping(source = "libelle", target = "libelle")
    List<TypeFournisseur> fromTypeFournisseurDtoList(List<TypeFournisseurDto> typeFournisseurDtoList);
}
