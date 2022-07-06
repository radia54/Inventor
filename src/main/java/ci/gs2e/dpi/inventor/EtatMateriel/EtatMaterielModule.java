package ci.gs2e.dpi.inventor.EtatMateriel;

import ci.gs2e.dpi.inventor.EtatMateriel.service.EtatMaterielService;
import ci.gs2e.dpi.inventor.EtatMateriel.service.EtatMaterielServiceImpl;
import ci.gs2e.dpi.inventor.Fournisseur.service.FournisseurService;
import ci.gs2e.dpi.inventor.Fournisseur.service.FournisseurServiceImpl;
import com.google.inject.AbstractModule;

public class EtatMaterielModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EtatMaterielService.class).to(EtatMaterielServiceImpl.class);
    }
}
