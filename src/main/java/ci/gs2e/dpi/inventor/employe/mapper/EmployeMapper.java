package ci.gs2e.dpi.inventor.employe.mapper;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeMapper {
    EmployeMapper INSTANCE = Mappers.getMapper( EmployeMapper.class);

    @Mapping(source = "matricule", target = "matricule")
    EmployeDto fromEmploye(Employe employe);

    @Mapping(source = "matricule", target = "matricule")
    Employe fromEmployeDto(EmployeDto employeDto);

    @Mapping(source = "matricule", target = "matricule")
    List<EmployeDto> fromEmployeList(List<Employe> employeList);
    @Mapping(source = "matricule", target = "matricule")
    List<Employe> fromEmployeDtoList(List<EmployeDto> employeDtoList);

}
