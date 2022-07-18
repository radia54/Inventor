package ci.gs2e.dpi.inventor.TypeFournisseur.controller;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeFournisseur.service.TypeFournisseurService;
import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("v1/typefournisseurs")
@CrossOrigin
@AllArgsConstructor
public class TypeFournisseurController {
    TypeFournisseurService typeFournisseurService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<TypeFournisseurDto>> getAll() {
        return new ResponseEntity<>(typeFournisseurService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
   // @RolesAllowed("backend-admin")
    public ResponseEntity<TypeFournisseurDto> create(@RequestBody TypeFournisseurDto typeFournisseurDto) {
        return new ResponseEntity<>(typeFournisseurService.create(typeFournisseurDto), HttpStatus.CREATED);
    }

    @GetMapping("/{magasinId}")
    public ResponseEntity<TypeFournisseur> getById(@PathVariable("magasinId") long id) {
        return new ResponseEntity<>(typeFournisseurService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{typefournisseurName}")
    public ResponseEntity<TypeFournisseur> getByName(@PathVariable("typefournisseurName") String name) {
        return new ResponseEntity<>(typeFournisseurService.getByName(name), HttpStatus.FOUND);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        typeFournisseurService.delete(id);
        return "deleted";
    }

    @PutMapping("/typefournisseur/{id}")
    public ResponseEntity<TypeFournisseurDto> update(@PathVariable("id") long id, @RequestBody TypeFournisseurDto typeFournisseurDto){
        return new ResponseEntity<>(typeFournisseurService.update(typeFournisseurDto,id), HttpStatus.UPGRADE_REQUIRED);
    }
}
