package ci.gs2e.dpi.inventor.BonCommande.mapper;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;
import ci.gs2e.dpi.inventor.Fournisseur.mapper.FournisseurMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BonCommandeMapper {
    BonCommandeMapper INSTANCE = Mappers.getMapper( BonCommandeMapper.class);

    @Mapping(source = "numero_bon_commande", target = "numero_bon_commande")
    BonCommandeDto fromBonCommande(BonCommande bonCommande);

    @Mapping(source = "numero_bon_commande", target = "numero_bon_commande")
    BonCommande fromBonCommandeDto(BonCommandeDto bonCommandeDto);

    @Mapping(source = "numero_bon_commande", target = "numero_bon_commande")
    List<BonCommandeDto> fromBonCommandeList(List<BonCommande> bonCommandeList);
    @Mapping(source = "numero_bon_commande", target = "numero_bon_commande")
    List<BonCommande> fromBonCommandeDtoList(List<BonCommandeDto> bonCommandeDtoList);

}
