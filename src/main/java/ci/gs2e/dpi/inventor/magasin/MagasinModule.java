package ci.gs2e.dpi.inventor.magasin;

import ci.gs2e.dpi.inventor.localisation.service.LocalisationService;
import ci.gs2e.dpi.inventor.localisation.service.LocalisationServiceImpl;
import ci.gs2e.dpi.inventor.magasin.service.MagasinService;
import ci.gs2e.dpi.inventor.magasin.service.MagasinServiceImpl;
import com.google.inject.AbstractModule;

public class MagasinModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MagasinService.class).to(MagasinServiceImpl.class);
    }
}


