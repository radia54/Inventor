package ci.gs2e.dpi.inventor.BonCommande;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.service.BonCommandeService;
import ci.gs2e.dpi.inventor.BonCommande.service.BonCommandeServiceImpl;
import ci.gs2e.dpi.inventor.emplacement.service.EmplacementService;
import ci.gs2e.dpi.inventor.emplacement.service.EmplacementServiceImpl;
import com.google.inject.AbstractModule;

public class BonCommandeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BonCommandeService.class).to(BonCommandeServiceImpl.class);
    }
}
