package ci.gs2e.dpi.inventor.TypeMateriel;

import ci.gs2e.dpi.inventor.TypeMateriel.service.TypeMaterielService;
import ci.gs2e.dpi.inventor.TypeMateriel.service.TypeMaterielServiceImpl;
import com.google.inject.AbstractModule;

import javax.swing.*;

public class TypeMaterielModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TypeMaterielService.class).to(TypeMaterielServiceImpl.class);
    }
}
