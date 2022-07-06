package ci.gs2e.dpi.inventor.EmployeSite;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.EmployeSite.service.EmployeSiteService;
import ci.gs2e.dpi.inventor.EmployeSite.service.EmployeSiteServiceImpl;

import com.google.inject.AbstractModule;

public class EmployeSiteModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EmployeSiteService.class).to(EmployeSiteServiceImpl.class);
    }
}
