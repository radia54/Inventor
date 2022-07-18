package ci.gs2e.dpi.inventor.BonCommande.service;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.BonCommande.mapper.BonCommandeMapper;
import ci.gs2e.dpi.inventor.BonCommande.repository.BonCommandeRepository;
import ci.gs2e.dpi.inventor.emplacement.mapper.EmplacementMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class BonCommandeServiceImpl implements BonCommandeService{
    BonCommandeRepository bonCommandeRepository;
    @Override
    public List<BonCommandeDto> getAll() {
        return BonCommandeMapper.INSTANCE.fromBonCommandeList(bonCommandeRepository.findAll());
    }

    @Override
    public BonCommandeDto create(BonCommandeDto bonCommandeDto) {
        return BonCommandeMapper.INSTANCE.fromBonCommande(bonCommandeRepository.save(BonCommandeMapper.INSTANCE.fromBonCommandeDto(bonCommandeDto)));
    }

    @Override
    public BonCommande getById(long id) {
        return bonCommandeRepository.findById(id).get();
    }

    @Override
    public void delete(long id) {
        bonCommandeRepository.deleteById(id);
    }

    @Override
    public BonCommandeDto update(BonCommandeDto bonCommande, long id) {
        BonCommandeDto com = BonCommandeMapper.INSTANCE.fromBonCommande(bonCommandeRepository.findById(id).get());
        if (Objects.nonNull(bonCommande.getNumero_bon_commande())){
            com.setNumero_bon_commande(bonCommande.getNumero_bon_commande());
        }
        return BonCommandeMapper.INSTANCE.fromBonCommande(bonCommandeRepository.save(BonCommandeMapper.INSTANCE.fromBonCommandeDto(com)));
    }


/*
    @Override
    public BonCommande getByName(String name) {
        return null;
    }
/*
    @Override
    public BonCommande getByName(int code) {
        return bonCommandeRepository.findByCode(code).get();
    }

 */
}
