package ci.gs2e.dpi.inventor.TypeFournisseur;

import ci.gs2e.dpi.inventor.Fournisseur.service.FournisseurService;
import ci.gs2e.dpi.inventor.Fournisseur.service.FournisseurServiceImpl;
import ci.gs2e.dpi.inventor.TypeFournisseur.service.TypeFournisseurService;
import ci.gs2e.dpi.inventor.TypeFournisseur.service.TypeFournisseurServiceImpl;
import com.google.inject.AbstractModule;

public class TypeFournisseurModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TypeFournisseurService.class).to(TypeFournisseurServiceImpl.class);
    }
}
