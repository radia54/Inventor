package ci.gs2e.dpi.inventor.MaterielEmploye.mapper;

import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.dto.MaterielEmplacementDto;
import ci.gs2e.dpi.inventor.MaterielEmploye.domain.MaterielEmploye;
import ci.gs2e.dpi.inventor.MaterielEmploye.domain.dto.MaterielEmployeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterielEmployeMapper {
    MaterielEmployeMapper INSTANCE = Mappers.getMapper( MaterielEmployeMapper.class);

    //@Mapping(source = "libelle", target = "libelle")
    MaterielEmployeDto fromMaterielEmploye(MaterielEmploye materielEmploye);

    // @Mapping(source = "libelle", target = "libelle")
    MaterielEmploye fromMaterielEmployeDto(MaterielEmployeDto materielEmployeDto);

    // @Mapping(source = "libelle", target = "liibelle")
    List<MaterielEmployeDto> fromMaterielEmployeList(List<MaterielEmploye> materielEmployeList);
    //@Mapping(source = "libelle", target = "libelle")
    List<MaterielEmploye> fromMaterielEmployeDtoList(List<MaterielEmployeDto> materielEmployeDtoList);

}
