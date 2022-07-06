package ci.gs2e.dpi.inventor.materiel;


import ci.gs2e.dpi.inventor.materiel.service.MaterielService;
import ci.gs2e.dpi.inventor.materiel.service.MaterielServiceImpl;
import com.google.inject.AbstractModule;

public class MaterielModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MaterielService.class).to(MaterielServiceImpl.class);
    }
}
