package ci.gs2e.dpi.inventor.TypeFournisseur.service;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.mapper.TypeFournisseurMapper;
import ci.gs2e.dpi.inventor.TypeFournisseur.repository.TypeFournisseurRepository;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class TypeFournisseurServiceImpl implements TypeFournisseurService{

    TypeFournisseurRepository typeFournisseurRepository;

    @Override
    public List<TypeFournisseurDto> getAll() {
        return TypeFournisseurMapper.INSTANCE.fromTypeFournisseurList(typeFournisseurRepository.findAll());
    }

    @Override
    public TypeFournisseurDto create(TypeFournisseurDto typeFournisseurDto) {
        return TypeFournisseurMapper.INSTANCE.fromTypeFournisseur(typeFournisseurRepository.save(TypeFournisseurMapper.INSTANCE.fromTypeFournisseurDto(typeFournisseurDto))) ;
    }

    @Override
    public TypeFournisseur getById(long id) {
        return typeFournisseurRepository.findById(id).get();
    }

    @Override
    public TypeFournisseur getByName(String name) {
        return typeFournisseurRepository.findByLibelle(name).get();
    }

    @Override
    public void delete(long id) {
        typeFournisseurRepository.deleteById(id);
    }

    @Override
    public TypeFournisseurDto update(TypeFournisseurDto typeFournisseur, long id) {
        TypeFournisseurDto type= TypeFournisseurMapper.INSTANCE.fromTypeFournisseur(typeFournisseurRepository.findById(id).get());
        if (Objects.nonNull(typeFournisseur.getLibelle())){
            type.setLibelle(typeFournisseur.getLibelle());
        }

        return TypeFournisseurMapper.INSTANCE.fromTypeFournisseur(typeFournisseurRepository.save(TypeFournisseurMapper.INSTANCE.fromTypeFournisseurDto(type)));
    }
}
