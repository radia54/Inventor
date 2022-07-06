package ci.gs2e.dpi.inventor.EtatMateriel.mapper;

import ci.gs2e.dpi.inventor.EtatMateriel.domain.EtatMateriel;
import ci.gs2e.dpi.inventor.EtatMateriel.domain.dto.EtatMaterielDto;
import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;
import ci.gs2e.dpi.inventor.Fournisseur.mapper.FournisseurMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EtatMaterielMapper {
    EtatMaterielMapper INSTANCE = Mappers.getMapper( EtatMaterielMapper.class);

    @Mapping(source = "libelle", target = "libelle")
    EtatMaterielDto fromEtatMateriel(EtatMateriel etatMateriel);

    @Mapping(source = "libelle", target = "libelle")
    EtatMateriel fromEtatMaterielDto(EtatMaterielDto etatMaterielDto);

    @Mapping(source = "libelle", target = "libelle")
    List<EtatMaterielDto> fromEtatMaterielList(List<EtatMateriel> etatMaterielList);
    @Mapping(source = "libelle", target = "libelle")
    List<EtatMateriel> fromEtatMaterielDtoList(List<EtatMaterielDto> etatMaterielDtoList);
}
