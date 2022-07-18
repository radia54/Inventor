package ci.gs2e.dpi.inventor.magasin.service;


import ci.gs2e.dpi.inventor.localisation.mapper.LocalisationMapper;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import ci.gs2e.dpi.inventor.magasin.repository.MagasinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class MagasinServiceImpl implements MagasinService {

    MagasinRepository magasinRepository;

    @Override
    public List<MagasinDto> getAll() {
        return MagasinMapper.INSTANCE.fromMagasinList(magasinRepository.findAll());
    }

    @Override
    public MagasinDto create(MagasinDto magasin) {
        return MagasinMapper.INSTANCE.fromMagasin(magasinRepository.save(MagasinMapper.INSTANCE.fromMagasinDto(magasin))) ;
    }

    @Override
    public Magasin getById(long id) {
        return magasinRepository.findById(id).get();
    }

    @Override
    public Magasin getByName(String name) {
        return magasinRepository.findByLibelle(name).get();
    }

    @Override
    public void delete(long id) {
        magasinRepository.deleteById(id);
    }

    @Override
    public MagasinDto update(MagasinDto magasinDto, long id) {
        MagasinDto magasinDto1= MagasinMapper.INSTANCE.fromMagasin(magasinRepository.findById(id).get());
        if (Objects.nonNull(magasinDto.getCode())){
            magasinDto1.setCode(magasinDto.getCode());
        }

        if (Objects.nonNull(magasinDto.getEntrepot())){
            magasinDto1.setEntrepot(magasinDto.getEntrepot());
        }
        if (Objects.nonNull(magasinDto.getLibelle())){
            magasinDto1.setLibelle(magasinDto.getLibelle());
        }
        if (Objects.nonNull(magasinDto.getLocalisation())){
            magasinDto1.setLocalisation(magasinDto.getLocalisation());
        }
        return MagasinMapper.INSTANCE.fromMagasin(magasinRepository.save(MagasinMapper.INSTANCE.fromMagasinDto(magasinDto1)));
    }
}
