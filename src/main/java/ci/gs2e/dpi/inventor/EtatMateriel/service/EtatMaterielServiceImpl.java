package ci.gs2e.dpi.inventor.EtatMateriel.service;

import ci.gs2e.dpi.inventor.EtatMateriel.domain.EtatMateriel;
import ci.gs2e.dpi.inventor.EtatMateriel.domain.dto.EtatMaterielDto;
import ci.gs2e.dpi.inventor.EtatMateriel.mapper.EtatMaterielMapper;
import ci.gs2e.dpi.inventor.EtatMateriel.repository.EtatMaterielRepository;
import ci.gs2e.dpi.inventor.Fournisseur.mapper.FournisseurMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class EtatMaterielServiceImpl implements EtatMaterielService{
    EtatMaterielRepository etatMaterielRepository;
    @Override
    public List<EtatMaterielDto> getAll() {
        return EtatMaterielMapper.INSTANCE.fromEtatMaterielList(etatMaterielRepository.findAll());
    }

    @Override
    public EtatMaterielDto create(EtatMaterielDto etatMaterielDto) {
        return  EtatMaterielMapper.INSTANCE.fromEtatMateriel(etatMaterielRepository.save(EtatMaterielMapper.INSTANCE.fromEtatMaterielDto(etatMaterielDto)));
    }

    @Override
    public EtatMateriel getById(long id) {
        return etatMaterielRepository.findById(id).get();
    }

    @Override
    public EtatMateriel getByName(String name) {
        return etatMaterielRepository.findByLibelle(name).get();
    }

    @Override
    public void delete(long id) {
        etatMaterielRepository.deleteById(id);
    }

    @Override
    public EtatMaterielDto update(EtatMaterielDto etat, long id) {
        EtatMaterielDto etatMaterielDto= EtatMaterielMapper.INSTANCE.fromEtatMateriel(etatMaterielRepository.findById(id).get());
        if (Objects.nonNull(etat.getLibelle())){
            etatMaterielDto.setLibelle(etat.getLibelle());
        }
        return EtatMaterielMapper.INSTANCE.fromEtatMateriel(etatMaterielRepository.save(EtatMaterielMapper.INSTANCE.fromEtatMaterielDto(etatMaterielDto)));
    }
}
