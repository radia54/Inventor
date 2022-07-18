package ci.gs2e.dpi.inventor.MaterielEmplacement.controller;

import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.MaterielEmplacement;
import ci.gs2e.dpi.inventor.MaterielEmplacement.domain.dto.MaterielEmplacementDto;
import ci.gs2e.dpi.inventor.MaterielEmplacement.service.MaterielEmplacementService;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/materielemplacement")
@CrossOrigin
@AllArgsConstructor
public class MaterielEmplacementController {
    MaterielEmplacementService materielEmplacementService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<MaterielEmplacementDto>> getAll() {
        return new ResponseEntity<>(materielEmplacementService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    // @RolesAllowed("backend-admin")
    public ResponseEntity<MaterielEmplacementDto> create(@RequestBody MaterielEmplacementDto materielEmplacementDto) {
        return new ResponseEntity<>(materielEmplacementService.create(materielEmplacementDto), HttpStatus.CREATED);
    }

    @GetMapping("/{materielemplacementId}")
    public ResponseEntity<MaterielEmplacement> getById(@PathVariable("materielemplacementId") long id) {
        return new ResponseEntity<>(materielEmplacementService.getById(id), HttpStatus.FOUND);
    }
/*
    @GetMapping("/{materielemplacementName}")
    public ResponseEntity<TypeFournisseur> getByName(@PathVariable("materielemplacementName") String name) {
        return new ResponseEntity<>(materielEmplacementService.getByName(name), HttpStatus.FOUND);
    }

 */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        materielEmplacementService.delete(id);
        return "deleted";
    }

    @PutMapping("/materielemplacement/{id}")
    public ResponseEntity<MaterielEmplacementDto> update(@PathVariable("id") long id, @RequestBody MaterielEmplacementDto materielEmplacementDto){
        return new ResponseEntity<>(materielEmplacementService.update(materielEmplacementDto,id), HttpStatus.UPGRADE_REQUIRED);
    }
}
