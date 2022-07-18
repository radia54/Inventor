package ci.gs2e.dpi.inventor.Fournisseur.controller;

import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.Fournisseur.domain.dto.FournisseurDto;
import ci.gs2e.dpi.inventor.Fournisseur.service.FournisseurService;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("v1/fournisseurs")
@CrossOrigin
@AllArgsConstructor
public class FournisseurController {
    FournisseurService fournisseurService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<FournisseurDto>> getAll() {
        return new ResponseEntity<>(fournisseurService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
   // @RolesAllowed("backend-admin")
    public ResponseEntity<FournisseurDto> create(@RequestBody FournisseurDto fournisseurDto) {
        return new ResponseEntity<>(fournisseurService.create(fournisseurDto), HttpStatus.CREATED);
    }

    @GetMapping("/{fournisseurId}")
    public ResponseEntity<Fournisseur> getById(@PathVariable("fournisseurId") long id) {
        return new ResponseEntity<>(fournisseurService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{fournisseurName}")
    public ResponseEntity<Fournisseur> getByName(@PathVariable("fournisseurName") String name) {
        return new ResponseEntity<>(fournisseurService.getByName(name), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        fournisseurService.delete(id);
        return "deleted";
    }

    @PutMapping("/fournisseur/{id}")
    public ResponseEntity<FournisseurDto> update(@PathVariable("id") long id, @RequestBody FournisseurDto fournisseurDto){
        return new ResponseEntity<>(fournisseurService.update(fournisseurDto, id), HttpStatus.UPGRADE_REQUIRED);
    }
}
