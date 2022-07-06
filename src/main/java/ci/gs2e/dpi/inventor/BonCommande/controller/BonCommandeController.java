package ci.gs2e.dpi.inventor.BonCommande.controller;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.BonCommande.service.BonCommandeService;
import ci.gs2e.dpi.inventor.emplacement.domain.Emplacement;
import ci.gs2e.dpi.inventor.emplacement.domain.dto.EmplacementDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/boncommandes")
@CrossOrigin
@AllArgsConstructor
public class BonCommandeController {
    BonCommandeService bonCommandeService;
    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<BonCommandeDto>> getAll() {
        return new ResponseEntity<>(bonCommandeService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<BonCommandeDto> create(@RequestBody BonCommandeDto bonCommandeDto) {
        return new ResponseEntity<>(bonCommandeService.create(bonCommandeDto), HttpStatus.CREATED);
    }

    @GetMapping("/{bonCommandeId}")
    public ResponseEntity<BonCommande> getById(@PathVariable("bonCommandeId") long id) {
        return new ResponseEntity<>(bonCommandeService.getById(id), HttpStatus.FOUND);
    }
/*
    @GetMapping("/{bonCommandeName}")
    public ResponseEntity<Emplacement> getByName(@PathVariable("bonCommandeName") String name) {
        return new ResponseEntity<>(bonCommandeService.getByName(name), HttpStatus.FOUND);
    }

 */
}
