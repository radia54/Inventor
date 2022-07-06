package ci.gs2e.dpi.inventor.Fournisseur.service;

import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;
import ci.gs2e.dpi.inventor.Fournisseur.mapper.FournisseurMapper;
import ci.gs2e.dpi.inventor.Fournisseur.repository.FournisseurRepository;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
