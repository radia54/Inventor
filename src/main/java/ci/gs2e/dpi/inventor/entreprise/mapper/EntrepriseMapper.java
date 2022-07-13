package ci.gs2e.dpi.inventor.entreprise.mapper;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.entreprise.domain.dto.EntrepriseDto;

import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntrepriseMapper {

    EntrepriseMapper INSTANCE = Mappers.getMapper( EntrepriseMapper.class);

    
    EntrepriseDto fromEntreprise(Entreprise entreprise);


    Entreprise fromEntrepriseDto(EntrepriseDto entrepriseDto);

    List<EntrepriseDto> fromEntrepriseList(List<Entreprise> entrepriseList);


    List<Entreprise> fromEntrepriseDtoList(List<EntrepriseDto> entrepriseDtoList);


}
