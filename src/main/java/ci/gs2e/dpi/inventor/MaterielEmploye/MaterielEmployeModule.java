package ci.gs2e.dpi.inventor.MaterielEmploye;


import ci.gs2e.dpi.inventor.MaterielEmploye.service.MaterielEmployeService;
import ci.gs2e.dpi.inventor.MaterielEmploye.service.MaterielEmployeServiceImpl;
import com.google.inject.AbstractModule;

public class MaterielEmployeModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MaterielEmployeService.class).to(MaterielEmployeServiceImpl.class);
    }
}
