package ci.gs2e.dpi.inventor.MaterielEmplacement.service;

import ci.gs2e.dpi.inventor.MaterielEmplacement.MaterielEmplacementRepository;
import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.dto.MaterielEmplacementDto;
import ci.gs2e.dpi.inventor.MaterielEmplacement.mapper.MaterielEmplacementMapper;
import ci.gs2e.dpi.inventor.MaterielEmploye.domain.dto.MaterielEmployeDto;
import ci.gs2e.dpi.inventor.MaterielEmploye.mapper.MaterielEmployeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class MaterielEmplacementServiceImpl implements MaterielEmplacementService{
    MaterielEmplacementRepository materielEmplacementRepository;
    @Override
    public List<MaterielEmplacementDto> getAll() {
        return MaterielEmplacementMapper.INSTANCE.fromMaterielEmplacementList(materielEmplacementRepository.findAll());
    }

    @Override
    public MaterielEmplacementDto create(MaterielEmplacementDto materielEmplacementDto) {
        return MaterielEmplacementMapper.INSTANCE.fromMaterielEmplacement(materielEmplacementRepository.save(MaterielEmplacementMapper.INSTANCE.fromMaterielEmplacementDto(materielEmplacementDto))) ;
    }

    @Override
    public MaterielEmplacement getById(long id) {
        return materielEmplacementRepository.findById(id).get();
    }
/*
    @Override
    public MaterielEmplacement getByName(String name) {
        return null;
    }

 */

    @Override
    public void delete(long id) {
        materielEmplacementRepository.deleteById(id);

    }

    @Override
    public MaterielEmplacementDto update(MaterielEmplacementDto materielEmplacementDto, long id) {
        MaterielEmplacementDto materielEmplacementDto1= MaterielEmplacementMapper.INSTANCE.fromMaterielEmplacement(materielEmplacementRepository.findById(id).get());
        if (Objects.nonNull(materielEmplacementDto.getEmplacement())){
            materielEmplacementDto1.setEmplacement(materielEmplacementDto.getEmplacement());
        }
        if (Objects.nonNull(materielEmplacementDto.getMateriel())){
            materielEmplacementDto1.setMateriel(materielEmplacementDto.getMateriel());
        }
        if (Objects.nonNull(materielEmplacementDto.getDateDebut())){
            materielEmplacementDto1.setDateDebut(materielEmplacementDto.getDateDebut());
        }
        if (Objects.nonNull(materielEmplacementDto.getDateFin())){
            materielEmplacementDto1.setDateFin(materielEmplacementDto.getDateFin());
        }
        return MaterielEmplacementMapper.INSTANCE.fromMaterielEmplacement(materielEmplacementRepository.save(MaterielEmplacementMapper.INSTANCE.fromMaterielEmplacementDto(materielEmplacementDto1)));

    }
}
