package ci.gs2e.dpi.inventor.entreprise.controller;

import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import ci.gs2e.dpi.inventor.entreprise.domain.dto.EntrepriseDto;
import ci.gs2e.dpi.inventor.entreprise.service.EntrepriseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/entreprises")
@CrossOrigin
@AllArgsConstructor
public class EntrepriseController {
    EntrepriseService entrepriseService;
    @GetMapping("/")
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<EntrepriseDto>> getAll() {
        return new ResponseEntity<>(entrepriseService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping("/")
    //@RolesAllowed("backend-admin")
    public ResponseEntity<EntrepriseDto> create(@RequestBody EntrepriseDto entrepriseDto) {
        return new ResponseEntity<>(entrepriseService.create(entrepriseDto), HttpStatus.CREATED);
    }

    @GetMapping("/{entrepriseId}")
    public ResponseEntity<Entreprise> getById(@PathVariable("entrepriseId") long id) {
        return new ResponseEntity<>(entrepriseService.getById(id), HttpStatus.FOUND);
    }
/*
    @GetMapping("/{entrepriseName}")
    public ResponseEntity<Entreprise> getByName(@PathVariable("entrepriseName") String name) {
        return new ResponseEntity<>(entrepriseService.getByName(name), HttpStatus.FOUND);
    }

 */



}
