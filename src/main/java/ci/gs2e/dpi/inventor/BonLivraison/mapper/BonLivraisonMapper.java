package ci.gs2e.dpi.inventor.BonLivraison.mapper;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.BonCommande.mapper.BonCommandeMapper;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.BonLivraison.domain.dto.BonLivraisonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring")
public interface BonLivraisonMapper {
    BonLivraisonMapper INSTANCE = Mappers.getMapper( BonLivraisonMapper.class);

    @Mapping(source = "numero_bon_livraison", target = "numero_bon_livraison")
    BonLivraisonDto fromBonLivraison(BonLivraison bonLivraison);

    @Mapping(source = "numero_bon_livraison", target = "numero_bon_livraison")
    BonLivraison fromBonLivraisonDto(BonLivraisonDto bonLivraisonDto);

    @Mapping(source = "numero_bon_livraison", target = "numero_bon_livraison")
    List<BonLivraisonDto> fromBonLivraisonList(List<BonLivraison> bonLivraisonList);
    @Mapping(source = "numero_bon_livraison", target = "numero_bon_livraison")
    List<BonLivraison> fromBonLivraisonDtoList(List<BonLivraisonDto> bonLivraisonDtoList);

}
