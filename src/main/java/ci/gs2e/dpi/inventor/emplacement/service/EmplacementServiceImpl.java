package ci.gs2e.dpi.inventor.emplacement.service;

import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.domain.dto.EmplacementDto;
import ci.gs2e.dpi.inventor.emplacement.mapper.EmplacementMapper;
import ci.gs2e.dpi.inventor.emplacement.repository.EmplacementRepository;
import ci.gs2e.dpi.inventor.employe.mapper.EmployeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmplacementServiceImpl implements EmplacementService {
    EmplacementRepository emplacementRepository;
    @Override
    public List<EmplacementDto> getAll() {
        return EmplacementMapper.INSTANCE.fromEmplacementList(emplacementRepository.findAll());
    }

    @Override
    public EmplacementDto create(EmplacementDto emplacementDto) {
        return EmplacementMapper.INSTANCE.fromEmplacement(emplacementRepository.save(EmplacementMapper.INSTANCE.fromEmplacementDto(emplacementDto)));
    }

    @Override
    public Emplacement getById(long id) {
        return emplacementRepository.findById(id).get();
    }

    @Override
    public Emplacement getByName(String name) {
        return emplacementRepository.findByLibelle(name).get();
    }
}
