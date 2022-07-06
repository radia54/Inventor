package ci.gs2e.dpi.inventor.Fournisseur.mapper;

import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FournisseurMapper {

    FournisseurMapper INSTANCE = Mappers.getMapper( FournisseurMapper.class);

    @Mapping(source = "nom", target = "nom")
    FournisseurDto fromFournisseur(Fournisseur fournisseur);

    @Mapping(source = "nom", target = "nom")
    Fournisseur fromFournisseurDto(FournisseurDto fournisseurDto);

    @Mapping(source = "nom", target = "nom")
    List<FournisseurDto> fromFournisseurList(List<Fournisseur> fournisseurList);
    @Mapping(source = "nom", target = "nom")
    List<Fournisseur> fromFournisseurDtoList(List<FournisseurDto> fournisseurDtoList);

}
