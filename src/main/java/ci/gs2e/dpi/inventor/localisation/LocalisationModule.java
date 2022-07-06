package ci.gs2e.dpi.inventor.localisation;

import ci.gs2e.dpi.inventor.entrepot.service.EntrepotService;
import ci.gs2e.dpi.inventor.entrepot.service.EntrepotServiceImpl;
import ci.gs2e.dpi.inventor.localisation.service.LocalisationService;
import ci.gs2e.dpi.inventor.localisation.service.LocalisationServiceImpl;
import com.google.inject.AbstractModule;

public class LocalisationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LocalisationService.class).to(LocalisationServiceImpl.class);
        //bind(EntrepotRepository.class).to(EntrepotServiceImpl.class);
    }
}
