package ci.gs2e.dpi.inventor.emplacement;

import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.service.EmplacementService;
import ci.gs2e.dpi.inventor.emplacement.service.EmplacementServiceImpl;
import ci.gs2e.dpi.inventor.magasin.service.MagasinService;
import ci.gs2e.dpi.inventor.magasin.service.MagasinServiceImpl;
import com.google.inject.AbstractModule;

public class EmplacementModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EmplacementService.class).to(EmplacementServiceImpl.class);
    }
}
