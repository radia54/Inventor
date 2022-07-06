package ci.gs2e.dpi.inventor.entrepot;

import ci.gs2e.dpi.inventor.entrepot.repository.EntrepotRepository;
import ci.gs2e.dpi.inventor.entrepot.service.EntrepotService;
import ci.gs2e.dpi.inventor.entrepot.service.EntrepotServiceImpl;
import com.google.inject.AbstractModule;

public class EntrepotModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(EntrepotService.class).to(EntrepotServiceImpl.class);
        //bind(EntrepotRepository.class).to(EntrepotServiceImpl.class);
    }
}
