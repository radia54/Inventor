package ci.gs2e.dpi.inventor.TypeMateriel.service;

import ci.gs2e.dpi.inventor.TypeFournisseur.mapper.TypeFournisseurMapper;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.dto.TypeMaterielDto;
import ci.gs2e.dpi.inventor.TypeMateriel.mapper.TypeMaterielMapper;
import ci.gs2e.dpi.inventor.TypeMateriel.repository.TypeMaterielRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeMaterielServiceImpl implements TypeMaterielService{
    TypeMaterielRepository typeMaterielRepository;

    @Override
    public List<TypeMaterielDto> getAll() {
        return TypeMaterielMapper.INSTANCE.fromTypeMaterielList(typeMaterielRepository.findAll());
    }

    @Override
    public TypeMaterielDto create(TypeMaterielDto typeMaterielDto) {
        return TypeMaterielMapper.INSTANCE.fromTypeMateriel(typeMaterielRepository.save(TypeMaterielMapper.INSTANCE.INSTANCE.fromTypeMaterielDto(typeMaterielDto)));
    }

    @Override
    public TypeMateriel getById(long id) {
        return typeMaterielRepository.findById(id).get();
    }

    @Override
    public TypeMateriel getByName(String name) {
        return typeMaterielRepository.findByLibelle(name).get();
    }
}
