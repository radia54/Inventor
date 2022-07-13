package ci.gs2e.dpi.inventor.entreprise;

import ci.gs2e.dpi.inventor.entreprise.service.EntrepriseService;
import ci.gs2e.dpi.inventor.entreprise.service.EntrepriseServiceImpl;

import com.google.inject.AbstractModule;

public class EntrepriseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EntrepriseService.class).to(EntrepriseServiceImpl.class);

    }
}
