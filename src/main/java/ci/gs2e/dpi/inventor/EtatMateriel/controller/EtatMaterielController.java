package ci.gs2e.dpi.inventor.EtatMateriel.controller;

import ci.gs2e.dpi.inventor.EtatMateriel.domain.EtatMateriel;
import ci.gs2e.dpi.inventor.EtatMateriel.domain.dto.EtatMaterielDto;
import ci.gs2e.dpi.inventor.EtatMateriel.service.EtatMaterielService;
import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("v1/etatmateriels")
@CrossOrigin
@AllArgsConstructor
public class EtatMaterielController {
    EtatMaterielService etatMaterielService;
    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<EtatMaterielDto>> getAll() {
        return new ResponseEntity<>(etatMaterielService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<EtatMaterielDto> create(@RequestBody EtatMaterielDto etatMaterielDto) {
        return new ResponseEntity<>(etatMaterielService.create(etatMaterielDto), HttpStatus.CREATED);
    }

    @GetMapping("/{etatMaterielId}")
    public ResponseEntity<EtatMateriel> getById(@PathVariable("etatMaterielId") long id) {
        return new ResponseEntity<>(etatMaterielService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{etatMaterielName}")
    public ResponseEntity<EtatMateriel> getByName(@PathVariable("etatMaterielName") String name) {
        return new ResponseEntity<>(etatMaterielService.getByName(name), HttpStatus.FOUND);
    }
}
