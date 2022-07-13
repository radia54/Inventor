package ci.gs2e.dpi.inventor.entreprise.service;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.entreprise.domain.dto.EntrepriseDto;
import ci.gs2e.dpi.inventor.entreprise.mapper.EntrepriseMapper;
import ci.gs2e.dpi.inventor.entreprise.repository.EntrepriseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntrepriseServiceImpl implements EntrepriseService{

    EntrepriseRepository entrepriseRepository;
    @Override
    public List<EntrepriseDto> getAll() {
        List<Entreprise> entreprises =entrepriseRepository.findAll();
        System.out.println(entreprises);
        return EntrepriseMapper.INSTANCE.fromEntrepriseList(entreprises);
    }

    @Override
    public EntrepriseDto create(EntrepriseDto entreprise) {
        return EntrepriseMapper.INSTANCE.fromEntreprise(entrepriseRepository.save(EntrepriseMapper.INSTANCE.fromEntrepriseDto(entreprise)));
    }

    @Override
    public Entreprise getById(long id) {
        return entrepriseRepository.findById(id).get();
    }

    /*
    @Override
    public Entreprise getByName(String name) {
        return entrepriseRepository.findByRaisonsociale(name);
    }

     */


}
