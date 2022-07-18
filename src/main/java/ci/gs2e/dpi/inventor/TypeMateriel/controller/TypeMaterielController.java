package ci.gs2e.dpi.inventor.TypeMateriel.controller;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.dto.TypeMaterielDto;
import ci.gs2e.dpi.inventor.TypeMateriel.service.TypeMaterielService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("v1/typetateriels")
@CrossOrigin
@AllArgsConstructor
public class TypeMaterielController {
    TypeMaterielService typeMaterielService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<TypeMaterielDto>> getAll() {
        return new ResponseEntity<>(typeMaterielService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<TypeMaterielDto> create(@RequestBody TypeMaterielDto typeMaterielDto) {
        return new ResponseEntity<>(typeMaterielService.create(typeMaterielDto), HttpStatus.CREATED);
    }

    @GetMapping("/{typematerielId}")
    public ResponseEntity<TypeMateriel> getById(@PathVariable("typematerielId") long id) {
        return new ResponseEntity<>(typeMaterielService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{typematerielName}")
    public ResponseEntity<TypeMateriel> getByName(@PathVariable("typematerielName") String name) {
        return new ResponseEntity<>(typeMaterielService.getByName(name), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        typeMaterielService.delete(id);
        return "deleted";
    }

    @PutMapping("/typemateriel/{id}")
    public ResponseEntity<TypeMaterielDto> update(@PathVariable("id") long id, @RequestBody TypeMaterielDto typeMaterielDto){
        return new ResponseEntity<>(typeMaterielService.update(typeMaterielDto, id), HttpStatus.UPGRADE_REQUIRED);
    }
}
