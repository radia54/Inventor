package ci.gs2e.dpi.inventor.emplacement.mapper;

import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.domain.dto.EmplacementDto;
import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;
import ci.gs2e.dpi.inventor.employe.mapper.EmployeMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmplacementMapper {
    EmplacementMapper INSTANCE = Mappers.getMapper( EmplacementMapper.class);

    @Mapping(source = "libelle", target = "libelle")
    EmplacementDto fromEmplacement(Emplacement emplacement);

    @Mapping(source = "libelle", target = "libelle")
    Emplacement fromEmplacementDto(EmplacementDto emplacementDto);

    @Mapping(source = "libelle", target = "libelle")
    List<EmplacementDto> fromEmplacementList(List<Emplacement> emplacementList);
    @Mapping(source = "libelle", target = "libelle")
    List<Emplacement> fromEmplacementDtoList(List<EmplacementDto> emplacementDtoList);

}
