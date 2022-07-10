package ci.gs2e.dpi.inventor.materiel.service;

import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import ci.gs2e.dpi.inventor.materiel.domain.dto.MaterielDto;
import ci.gs2e.dpi.inventor.materiel.mapper.MaterielMapper;
import ci.gs2e.dpi.inventor.materiel.repository.MaterielRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MaterielServiceImpl implements MaterielService{


    MaterielRepository materielRepository;
    @Override
    public List<MaterielDto> getAll() {
        return MaterielMapper.INSTANCE.fromMaterielList(materielRepository.findAll());
    }

    @Override
    public MaterielDto create(MaterielDto materielDto) {
        return MaterielMapper.INSTANCE.fromMateriel(materielRepository.save(MaterielMapper.INSTANCE.fromMaterielDto( materielDto)));
    }

    @Override
    public Materiel getById(long id) {
        return materielRepository.findById(id).get();
    }

    @Override
    public Materiel getByName(String name) {
        return materielRepository.findByLibelle(name).get();
    }
}
