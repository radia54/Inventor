package ci.gs2e.dpi.inventor.AppSequence.service;

import ci.gs2e.dpi.inventor.AppSequence.domain.AppSequence;
import ci.gs2e.dpi.inventor.AppSequence.domain.dto.AppSequenceDto;
import ci.gs2e.dpi.inventor.AppSequence.mapper.AppSequenceMapper;
import ci.gs2e.dpi.inventor.AppSequence.repository.AppSequenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppSequenceServiceImpl implements AppSequenceService{
    AppSequenceRepository appSequenceRepository;

    @Override
    public List<AppSequenceDto> getAll() {
        return AppSequenceMapper.INSTANCE.fromAppSequenceList(appSequenceRepository.findAll());
    }

    @Override
    public AppSequenceDto create(AppSequenceDto appSequenceDto) {
        return AppSequenceMapper.INSTANCE.fromAppSequence(appSequenceRepository.save(AppSequenceMapper.INSTANCE.fromAppSequenceDto(appSequenceDto)));
    }

    @Override
    public AppSequence getById(long id) {
        return appSequenceRepository.findById(id).get();
    }

    @Override
    public AppSequence getByName(String name) {
        return appSequenceRepository.findByPrefixe(name).get();
    }
}
