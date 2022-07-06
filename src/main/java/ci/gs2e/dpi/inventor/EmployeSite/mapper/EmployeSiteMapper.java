package ci.gs2e.dpi.inventor.EmployeSite.mapper;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.EmployeSite.domain.dto.EmployeSiteDto;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface EmployeSiteMapper {
    EmployeSiteMapper INSTANCE = Mappers.getMapper( EmployeSiteMapper.class);

    @Mapping(source = "localisation_site", target = "localisation_site")
    EmployeSiteDto fromEmployeSite(EmployeSite employeSite);

    @Mapping(source = "localisation_site", target = "localisation_site")
    EmployeSite fromEmployeDto(EmployeSiteDto employeSiteDto);

    @Mapping(source = "localisation_site", target = "localisation_site")
    List<EmployeSiteDto> fromEmployeSiteList(List<EmployeSite> employeSiteList);
    @Mapping(source = "localisation_site", target = "localisation_site")
    List<EmployeSite> fromEmployeSiteDtoList(List<EmployeSiteDto> employeSiteDtoList);

}
