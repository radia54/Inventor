package ci.gs2e.dpi.inventor.materiel.controller;

import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import ci.gs2e.dpi.inventor.materiel.domain.Materiel;
import ci.gs2e.dpi.inventor.materiel.domain.dto.MaterielDto;
import ci.gs2e.dpi.inventor.materiel.service.MaterielService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("v1/materiels")
@CrossOrigin
@AllArgsConstructor
public class MaterrielController {

    MaterielService materielService;

    @GetMapping
   // @RolesAllowed("backend-user")
    public ResponseEntity<List<MaterielDto>> getAll() {
        return new ResponseEntity<>(materielService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<MaterielDto> create(@RequestBody MaterielDto materielDto) {
        return new ResponseEntity<>(materielService.create(materielDto), HttpStatus.CREATED);
    }

    @GetMapping("/{materielId}")
    public ResponseEntity<Materiel> getById(@PathVariable("materielId") long id) {
        return new ResponseEntity<>(materielService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{materielName}")
    public ResponseEntity<Materiel> getByName(@PathVariable("materielName") String name) {
        return new ResponseEntity<>(materielService.getByName(name), HttpStatus.FOUND);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        materielService.delete(id);
        return "deleted";
    }

    @PutMapping("/materiel/{id}")
    public ResponseEntity<MaterielDto> update(@PathVariable("id") long id, @RequestBody MaterielDto materielDto){
        return new ResponseEntity<>(materielService.update(materielDto, id), HttpStatus.UPGRADE_REQUIRED);
    }
}
