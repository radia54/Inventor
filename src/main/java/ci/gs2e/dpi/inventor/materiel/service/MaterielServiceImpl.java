package ci.gs2e.dpi.inventor.materiel.service;

import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import ci.gs2e.dpi.inventor.materiel.domain.dto.MaterielDto;
import ci.gs2e.dpi.inventor.materiel.mapper.MaterielMapper;
import ci.gs2e.dpi.inventor.materiel.repository.MaterielRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void delete(long id) {
        materielRepository.deleteById(id);

    }

    @Override
    public MaterielDto update(MaterielDto materielDto, long id) {
        MaterielDto mat = MaterielMapper.INSTANCE.fromMateriel(materielRepository.findById(id).get());
        if (Objects.nonNull(materielDto.getEtatMateriel())){
            mat.setEtatMateriel(materielDto.getEtatMateriel());
        }
        if (Objects.nonNull(materielDto.getBonCommande())){
            mat.setBonCommande(materielDto.getBonCommande());
        }
        if (Objects.nonNull(materielDto.getTypeMateriel())){
            mat.setTypeMateriel(materielDto.getTypeMateriel());
        }
        if (Objects.nonNull(materielDto.getBonLivraison())){
            mat.setBonLivraison(materielDto.getBonLivraison());
        }

        if (Objects.nonNull(materielDto.getCode())){
            mat.setCode(materielDto.getCode());
        }
        if (Objects.nonNull(materielDto.getDate_enregistrement())){
            mat.setDate_enregistrement(materielDto.getDate_enregistrement());

        }
        if (Objects.nonNull(materielDto.getDebut_garantie())){
            mat.setDebut_garantie(materielDto.getDebut_garantie());
        }
        if (Objects.nonNull(materielDto.getEntreprise())){
            mat.setEntreprise(materielDto.getEntreprise());
        }
        if (Objects.nonNull(materielDto.getFin_garantie())){
            mat.setFin_garantie(materielDto.getFin_garantie());
        }
        if (Objects.nonNull(materielDto.getFournisseur())){
            mat.setFournisseur(materielDto.getFournisseur());
        }
        if (Objects.nonNull(materielDto.getLibelle())){
            mat.setLibelle(materielDto.getLibelle());
        }
        if (Objects.nonNull(materielDto.getMarque())){
            mat.setMarque(materielDto.getMarque());
        }
        if (Objects.nonNull(materielDto.getModele())){
            mat.setModele(materielDto.getModele());
        }

        if (Objects.nonNull(materielDto.getMontant())){
            mat.setMontant(materielDto.getMontant());
        }
        if (Objects.nonNull(materielDto.getNumero_serie())){
            mat.setNumero_serie(materielDto.getNumero_serie());
        }
        if (Objects.nonNull(materielDto.getQuantite())){
            mat.setQuantite(materielDto.getQuantite());
        }
        return MaterielMapper.INSTANCE.fromMateriel(materielRepository.save(MaterielMapper.INSTANCE.fromMaterielDto(materielDto)));
    }
}
