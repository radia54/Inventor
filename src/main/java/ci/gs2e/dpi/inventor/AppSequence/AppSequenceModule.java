package ci.gs2e.dpi.inventor.AppSequence;

import ci.gs2e.dpi.inventor.AppSequence.service.AppSequenceService;
import ci.gs2e.dpi.inventor.AppSequence.service.AppSequenceServiceImpl;
import com.google.inject.AbstractModule;

public class AppSequenceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(AppSequenceService.class).to(AppSequenceServiceImpl.class);
    }
}
