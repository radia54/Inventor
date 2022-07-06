package ci.gs2e.dpi.inventor.AppSequence.mapper;

import ci.gs2e.dpi.inventor.AppSequence.domain.AppSequence;
import ci.gs2e.dpi.inventor.AppSequence.domain.dto.AppSequenceDto;
import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.BonCommande.mapper.BonCommandeMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AppSequenceMapper {
    AppSequenceMapper INSTANCE = Mappers.getMapper( AppSequenceMapper.class);

    @Mapping(source = "prefixe", target = "prefixe")
    AppSequenceDto fromAppSequence(AppSequence appSequence);

    @Mapping(source = "prefixe", target = "prefixe")
    AppSequence fromAppSequenceDto(AppSequenceDto appSequenceDto);

    @Mapping(source = "prefixe", target = "prefixe")
    List<AppSequenceDto> fromAppSequenceList(List<AppSequence> appSequenceList);
    @Mapping(source = "prefixe", target = "prefixe")
    List<AppSequence> fromAppSequenceDtoList(List<AppSequenceDto> appSequenceDtoList);

}
