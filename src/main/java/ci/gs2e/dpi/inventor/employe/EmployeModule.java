package ci.gs2e.dpi.inventor.employe;

import ci.gs2e.dpi.inventor.magasin.service.MagasinService;
import ci.gs2e.dpi.inventor.magasin.service.MagasinServiceImpl;
import com.google.inject.AbstractModule;

public class EmployeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MagasinService.class).to(MagasinServiceImpl.class);
    }
}
