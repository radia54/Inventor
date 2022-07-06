package ci.gs2e.dpi.inventor.BonLivraison.service;

import ci.gs2e.dpi.inventor.BonCommande.mapper.BonCommandeMapper;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.BonLivraison.domain.dto.BonLivraisonDto;
import ci.gs2e.dpi.inventor.BonLivraison.mapper.BonLivraisonMapper;
import ci.gs2e.dpi.inventor.BonLivraison.repository.BonLivraisonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
}
