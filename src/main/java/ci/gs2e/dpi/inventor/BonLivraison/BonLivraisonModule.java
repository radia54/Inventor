package ci.gs2e.dpi.inventor.BonLivraison;

import ci.gs2e.dpi.inventor.BonCommande.service.BonCommandeService;
import ci.gs2e.dpi.inventor.BonCommande.service.BonCommandeServiceImpl;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.BonLivraison.service.BonLivraisonService;
import ci.gs2e.dpi.inventor.BonLivraison.service.BonLivraisonServiceImpl;
import com.google.inject.AbstractModule;

public class BonLivraisonModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BonLivraisonService.class).to(BonLivraisonServiceImpl.class);
    }
}
