package ci.gs2e.dpi.inventor.MaterielEmploye.controller;

import ci.gs2e.dpi.inventor.MaterielEmploye.domain.MaterielEmploye;
import ci.gs2e.dpi.inventor.MaterielEmploye.domain.dto.MaterielEmployeDto;
import ci.gs2e.dpi.inventor.MaterielEmploye.service.MaterielEmployeService;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.TypeFournisseur.domain.dto.TypeFournisseurDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/materielEmploye")
@AllArgsConstructor
@CrossOrigin
public class MaterielEmployeController {
    MaterielEmployeService materielEmployeService;


    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<MaterielEmployeDto>> getAll() {
        return new ResponseEntity<>(materielEmployeService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    // @RolesAllowed("backend-admin")
    public ResponseEntity<MaterielEmployeDto> create(@RequestBody MaterielEmployeDto materielEmployeDto) {
        return new ResponseEntity<>(materielEmployeService.create(materielEmployeDto), HttpStatus.CREATED);
    }

    @GetMapping("/{materielemployeId}")
    public ResponseEntity<MaterielEmploye> getById(@PathVariable("materielemployeId") long id) {
        return new ResponseEntity<>(materielEmployeService.getById(id), HttpStatus.FOUND);
    }
/*
    @GetMapping("/{materielemployeName}")
    public ResponseEntity<MaterielEmploye> getByName(@PathVariable("materielfournisseurName") String name) {
        return new ResponseEntity<>(materielEmployeService.getByName(name), HttpStatus.FOUND);
    }

 */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        materielEmployeService.delete(id);
        return "deleted";
    }

    @PutMapping("/materielemploye/{id}")
    public ResponseEntity<MaterielEmployeDto> update(@PathVariable("id") long id, @RequestBody MaterielEmployeDto materielEmployeDto){
        return new ResponseEntity<>(materielEmployeService.update(materielEmployeDto,id), HttpStatus.UPGRADE_REQUIRED);
    }
}
