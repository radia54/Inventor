package ci.gs2e.dpi.inventor.TypeMateriel.service;

import ci.gs2e.dpi.inventor.TypeFournisseur.mapper.TypeFournisseurMapper;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.dto.TypeMaterielDto;
import ci.gs2e.dpi.inventor.TypeMateriel.mapper.TypeMaterielMapper;
import ci.gs2e.dpi.inventor.TypeMateriel.repository.TypeMaterielRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void delete(long id) {
        typeMaterielRepository.deleteById(id);
    }


    @Override
    public TypeMaterielDto update(TypeMaterielDto typeMaterielDto, long id) {
        TypeMaterielDto typeMaterielDto1 = TypeMaterielMapper.INSTANCE.fromTypeMateriel(typeMaterielRepository.findById(id).get());
        if (Objects.nonNull(typeMaterielDto.getCode())){
            typeMaterielDto1.setCode(typeMaterielDto.getCode());
        }
        if (Objects.nonNull(typeMaterielDto.getLibelle())){
            typeMaterielDto1.setLibelle(typeMaterielDto.getLibelle());
        }
        return TypeMaterielMapper.INSTANCE.fromTypeMateriel(typeMaterielRepository.save(TypeMaterielMapper.INSTANCE.fromTypeMaterielDto(typeMaterielDto1)));
    }

}
