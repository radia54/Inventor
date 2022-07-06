package ci.gs2e.dpi.inventor.entrepot.mapper;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntrepotMapper {

    EntrepotMapper INSTANCE = Mappers.getMapper( EntrepotMapper.class);

    @Mapping(source = "libelle", target = "nomEntrepot")
    EntrepotDto fromEntrepot(Entrepot entrepot);

    @Mapping(source = "nomEntrepot", target = "libelle")
    Entrepot fromEntrepotDto(EntrepotDto entrepotDto);

    @Mapping(source = "libelle", target = "nomEntrepot")
    List<EntrepotDto> fromEntrepotList(List<Entrepot> entrepotList);
    @Mapping(source = "nomEntrepot", target = "libelle")
    List<Entrepot> fromEntrepotDtoList(List<EntrepotDto> entrepotDtoList);

}
