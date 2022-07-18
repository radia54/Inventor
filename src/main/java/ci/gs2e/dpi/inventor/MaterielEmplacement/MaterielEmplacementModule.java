package ci.gs2e.dpi.inventor.MaterielEmplacement;

import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import ci.gs2e.dpi.inventor.MaterielEmplacement.service.MaterielEmplacementService;
import ci.gs2e.dpi.inventor.MaterielEmplacement.service.MaterielEmplacementServiceImpl;
import ci.gs2e.dpi.inventor.TypeFournisseur.service.TypeFournisseurService;
import ci.gs2e.dpi.inventor.TypeFournisseur.service.TypeFournisseurServiceImpl;
import com.google.inject.AbstractModule;

public class MaterielEmplacementModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MaterielEmplacementService.class).to(MaterielEmplacementServiceImpl.class);
    }

}
