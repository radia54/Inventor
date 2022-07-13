package ci.gs2e.dpi.inventor.entrepot.service;

import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.mapper.EmplacementMapper;
import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;
import ci.gs2e.dpi.inventor.entrepot.mapper.EntrepotMapper;
import ci.gs2e.dpi.inventor.entrepot.repository.EntrepotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class EntrepotServiceImpl implements EntrepotService{

    //@Inject
    EntrepotRepository entrepotRepository;



    //@Inject EntrepotService entrepotService;

    /* EntrepotService entrepotService;

    public EntrepotServiceImpl(EntrepotService entrepotService) {
        this.entrepotService = entrepotService;
    } */

    @Override
    public List<EntrepotDto> getAll() {
        return EntrepotMapper.INSTANCE.fromEntrepotList(entrepotRepository.findAll());
    }

    @Override
    public EntrepotDto create(EntrepotDto entrepot) {
        return EntrepotMapper.INSTANCE.fromEntrepot(entrepotRepository.save(EntrepotMapper.INSTANCE.fromEntrepotDto(entrepot)));
    }

    @Override
    public Entrepot getById(long id) {
        return entrepotRepository.findById(id).get();
    }



    @Override
    public Entrepot getByName(String name) {
        return entrepotRepository.findByLibelle(name);
    }

    @Override
    public EntrepotDto update(EntrepotDto entrepotDto, long id) {
         EntrepotDto ent =  EntrepotMapper.INSTANCE.fromEntrepot(entrepotRepository.findById(id).get());
        if(Objects.nonNull(entrepotDto.getCode())){
            ent.setCode(entrepotDto.getCode());
        }
        if (Objects.nonNull(entrepotDto.getLibelle())){
            ent.setCode(entrepotDto.getCode());

        }


        return EntrepotMapper.INSTANCE.fromEntrepot(entrepotRepository.save(EntrepotMapper.INSTANCE.fromEntrepotDto(ent)));

    }

    @Override
    public void delete(long id) {
         entrepotRepository.deleteById(id);

    }


}
