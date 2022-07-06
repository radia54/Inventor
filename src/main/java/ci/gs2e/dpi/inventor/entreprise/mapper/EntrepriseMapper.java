package ci.gs2e.dpi.inventor.entreprise.mapper;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.entreprise.domain.dto.EntrepriseDto;
import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import ci.gs2e.dpi.inventor.localisation.domain.dto.LocalisationDto;
import ci.gs2e.dpi.inventor.localisation.mapper.LocalisationMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntrepriseMapper {
    EntrepriseMapper INSTANCE = Mappers.getMapper( EntrepriseMapper.class);

    @Mapping(source = "raison_sociale", target = "nomEntreprise")
    EntrepriseDto fromEntreprise(Entreprise entreprise);

    @Mapping(source = "nomEntreprise", target = "raison_sociale")
    Entreprise fromEntrepriseDto(EntrepriseDto entrepriseDto);

    @Mapping(source = "raison_sociale", target = "nomEntreprise")
    List<EntrepriseDto> fromEntrepriseList(List<Entreprise> entrepriseList);
    @Mapping(source = "nomEntreprise", target = "raison_sociale")
    List<Entreprise> fromEntreprisetoList(List<EntrepriseDto> entrepriseDtoList);


}
