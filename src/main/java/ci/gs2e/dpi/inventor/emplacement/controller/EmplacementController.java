package ci.gs2e.dpi.inventor.emplacement.controller;

import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.domain.dto.EmplacementDto;
import ci.gs2e.dpi.inventor.emplacement.service.EmplacementService;
import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/emplacements")
@CrossOrigin
@AllArgsConstructor
public class EmplacementController {
    EmplacementService emplacementService;
    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<EmplacementDto>> getAll() {
        return new ResponseEntity<>(emplacementService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<EmplacementDto> create(@RequestBody EmplacementDto emplacement) {
        return new ResponseEntity<>(emplacementService.create(emplacement), HttpStatus.CREATED);
    }

    @GetMapping("/{employeId}")
    public ResponseEntity<Emplacement> getById(@PathVariable("emplacementId") long id) {
        return new ResponseEntity<>(emplacementService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{emplacementName}")
    public ResponseEntity<Emplacement> getByName(@PathVariable("emplacementName") String name) {
        return new ResponseEntity<>(emplacementService.getByName(name), HttpStatus.FOUND);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        emplacementService.delete(id);
    }

    @PutMapping("/emplacement/{id}")
    public ResponseEntity<EmplacementDto> update(@PathVariable("id") long id, @RequestBody EmplacementDto emplacement){
        return new ResponseEntity<>(emplacementService.update(emplacement, id), HttpStatus.UPGRADE_REQUIRED);
    }

}
