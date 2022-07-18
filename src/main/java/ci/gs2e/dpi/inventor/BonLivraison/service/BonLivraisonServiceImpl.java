package ci.gs2e.dpi.inventor.BonLivraison.service;

import ci.gs2e.dpi.inventor.BonCommande.mapper.BonCommandeMapper;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.BonLivraison.domain.dto.BonLivraisonDto;
import ci.gs2e.dpi.inventor.BonLivraison.mapper.BonLivraisonMapper;
import ci.gs2e.dpi.inventor.BonLivraison.repository.BonLivraisonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class BonLivraisonServiceImpl implements BonLivraisonService{
    BonLivraisonRepository bonLivraisonRepository;
    @Override
    public List<BonLivraisonDto> getAll() {
        return BonLivraisonMapper.INSTANCE.fromBonLivraisonList(bonLivraisonRepository.findAll());
    }

    @Override
    public BonLivraisonDto create(BonLivraisonDto bonLivraisonDto) {
        return BonLivraisonMapper.INSTANCE.fromBonLivraison(bonLivraisonRepository.save(BonLivraisonMapper.INSTANCE.fromBonLivraisonDto(bonLivraisonDto)));
    }

    @Override
    public BonLivraison getById(long id) {
        return bonLivraisonRepository.findById(id).get();
    }

    @Override
    public void delete(long id) {
        bonLivraisonRepository.deleteById(id);
    }

    @Override
    public BonLivraisonDto update(BonLivraisonDto bonLivraisonDto, long id) {
        BonLivraisonDto livraisonDto = BonLivraisonMapper.INSTANCE.fromBonLivraison(bonLivraisonRepository.findById(id).get());
        if(Objects.nonNull(bonLivraisonDto.getNumero_bon_livraison())){
            livraisonDto.setNumero_bon_livraison(bonLivraisonDto.getNumero_bon_livraison());
        }

        return BonLivraisonMapper.INSTANCE.fromBonLivraison(bonLivraisonRepository.save(BonLivraisonMapper.INSTANCE.fromBonLivraisonDto(bonLivraisonDto)));
    }
}
