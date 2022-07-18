package ci.gs2e.dpi.inventor.MaterielEmploye.service;

import ci.gs2e.dpi.inventor.MaterielEmploye.domain.MaterielEmploye;
import ci.gs2e.dpi.inventor.MaterielEmploye.domain.dto.MaterielEmployeDto;
import ci.gs2e.dpi.inventor.MaterielEmploye.mapper.MaterielEmployeMapper;
import ci.gs2e.dpi.inventor.MaterielEmploye.repository.MaterielEmployeRepository;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.mapper.TypeFournisseurMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class MaterielEmployeServiceImpl implements MaterielEmployeService{
    MaterielEmployeRepository materielEmployeRepository;

    @Override
    public List<MaterielEmployeDto> getAll() {
        return MaterielEmployeMapper.INSTANCE.fromMaterielEmployeList(materielEmployeRepository.findAll());
    }

    @Override
    public MaterielEmployeDto create(MaterielEmployeDto materielEmployeDto) {
        return MaterielEmployeMapper.INSTANCE.fromMaterielEmploye(materielEmployeRepository.save(MaterielEmployeMapper.INSTANCE.fromMaterielEmployeDto(materielEmployeDto))) ;
    }

    @Override
    public MaterielEmploye getById(long id) {
        return materielEmployeRepository.findById(id).get();
    }



    @Override
    public void delete(long id) {
        materielEmployeRepository.deleteById(id);

    }

    @Override
    public MaterielEmployeDto update(MaterielEmployeDto materielEmployeDto, long id) {
        MaterielEmployeDto materielEmployeDto1= MaterielEmployeMapper.INSTANCE.fromMaterielEmploye(materielEmployeRepository.findById(id).get());
        if (Objects.nonNull(materielEmployeDto.getEmploye())){
            materielEmployeDto1.setEmploye(materielEmployeDto.getEmploye());
        }
        if (Objects.nonNull(materielEmployeDto.getMateriel())){
            materielEmployeDto1.setMateriel(materielEmployeDto.getMateriel());
        }
        if (Objects.nonNull(materielEmployeDto.getDateDebutAffectation())){
            materielEmployeDto1.setDateDebutAffectation(materielEmployeDto.getDateDebutAffectation());
        }
        if (Objects.nonNull(materielEmployeDto.getDateFinAffectation())){
            materielEmployeDto1.setDateFinAffectation(materielEmployeDto.getDateFinAffectation());
        }
        return MaterielEmployeMapper.INSTANCE.fromMaterielEmploye(materielEmployeRepository.save(MaterielEmployeMapper.INSTANCE.fromMaterielEmployeDto(materielEmployeDto1)));
    }
}
