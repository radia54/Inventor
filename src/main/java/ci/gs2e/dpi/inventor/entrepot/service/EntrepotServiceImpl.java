package ci.gs2e.dpi.inventor.entrepot.service;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;
import ci.gs2e.dpi.inventor.entrepot.mapper.EntrepotMapper;
import ci.gs2e.dpi.inventor.entrepot.repository.EntrepotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
