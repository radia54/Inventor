package ci.gs2e.dpi.inventor.TypeFournisseur.service;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.mapper.TypeFournisseurMapper;
import ci.gs2e.dpi.inventor.TypeFournisseur.repository.TypeFournisseurRepository;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeFournisseurServiceImpl implements TypeFournisseurService{

    TypeFournisseurRepository typeFournisseurRepository;

    @Override
    public List<TypeFournisseurDto> getAll() {
        return TypeFournisseurMapper.INSTANCE.fromTypeFournisseurList(typeFournisseurRepository.findAll());
    }

    @Override
    public TypeFournisseurDto create(TypeFournisseurDto typeFournisseurDto) {
        return TypeFournisseurMapper.INSTANCE.fromTypeFournisseur(typeFournisseurRepository.save(TypeFournisseurMapper.INSTANCE.INSTANCE.fromTypeFournisseurDto(typeFournisseurDto))) ;
    }

    @Override
    public TypeFournisseur getById(long id) {
        return typeFournisseurRepository.findById(id).get();
    }

    @Override
    public TypeFournisseur getByName(String name) {
        return typeFournisseurRepository.findByLibelle(name).get();
    }
}
