package ci.gs2e.dpi.inventor.Fournisseur;

import ci.gs2e.dpi.inventor.Fournisseur.service.FournisseurService;
import ci.gs2e.dpi.inventor.Fournisseur.service.FournisseurServiceImpl;
import ci.gs2e.dpi.inventor.magasin.service.MagasinService;
import ci.gs2e.dpi.inventor.magasin.service.MagasinServiceImpl;
import com.google.inject.AbstractModule;

public class FournisseurModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FournisseurService.class).to(FournisseurServiceImpl.class);
    }
}
