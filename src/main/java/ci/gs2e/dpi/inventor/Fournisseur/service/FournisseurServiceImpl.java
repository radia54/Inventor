package ci.gs2e.dpi.inventor.Fournisseur.service;

import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;
import ci.gs2e.dpi.inventor.Fournisseur.mapper.FournisseurMapper;
import ci.gs2e.dpi.inventor.Fournisseur.repository.FournisseurRepository;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class FournisseurServiceImpl implements FournisseurService{

    FournisseurRepository fournisseurRepository;
    @Override
    public List<FournisseurDto> getAll() {
        return FournisseurMapper.INSTANCE.fromFournisseurList(fournisseurRepository.findAll());
    }

    @Override
    public FournisseurDto create(FournisseurDto fournisseur) {
        return FournisseurMapper.INSTANCE.fromFournisseur(fournisseurRepository.save(FournisseurMapper.INSTANCE.fromFournisseurDto(fournisseur)));
    }

    @Override
    public Fournisseur getById(long id) {
        return fournisseurRepository.findById(id).get();
    }

    @Override
    public Fournisseur getByName(String name) {
        return fournisseurRepository.findByNom(name).get();
    }

    @Override
    public void delete(long id) {
        fournisseurRepository.deleteById(id);

    }

    @Override
    public FournisseurDto update(FournisseurDto fournisseurDto, long id) {
        FournisseurDto fourn = FournisseurMapper.INSTANCE.fromFournisseur(fournisseurRepository.findById(id).get());
        if (Objects.nonNull(fournisseurDto.getAdresse())){
            fourn.setAdresse(fournisseurDto.getAdresse());
        }
        if (Objects.nonNull(fournisseurDto.getContact())){
            fourn.setContact(fournisseurDto.getContact());
        }
        if (Objects.nonNull(fournisseurDto.getTypeFournisseur())){
            fourn.setTypeFournisseur(fournisseurDto.getTypeFournisseur());
        }
        if (Objects.nonNull(fournisseurDto.getEmail())){
            fourn.setEmail(fournisseurDto.getEmail());
        }
        if (Objects.nonNull(fournisseurDto.getNom())){
            fourn.setNom(fournisseurDto.getNom());
        }
        if (Objects.nonNull(fournisseurDto.getPrenom())){
            fourn.setPrenom(fournisseurDto.getPrenom());
        }
        if (Objects.nonNull(fournisseurDto.getRaison_sociale())){
            fourn.setRaison_sociale(fournisseurDto.getRaison_sociale());
        }
        if (Objects.nonNull(fournisseurDto.getSite_web())){
            fourn.setSite_web(fournisseurDto.getSite_web());
        }

        return FournisseurMapper.INSTANCE.fromFournisseur(fournisseurRepository.save(FournisseurMapper.INSTANCE.fromFournisseurDto(fourn)));
    }
}
