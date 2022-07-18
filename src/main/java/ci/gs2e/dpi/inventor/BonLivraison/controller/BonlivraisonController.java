package ci.gs2e.dpi.inventor.BonLivraison.controller;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.BonLivraison.domain.dto.BonLivraisonDto;
import ci.gs2e.dpi.inventor.BonLivraison.service.BonLivraisonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/bonlivraisons")
@CrossOrigin
@AllArgsConstructor
public class BonlivraisonController {
    BonLivraisonService bonLivraisonService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<BonLivraisonDto>> getAll() {
        return new ResponseEntity<>(bonLivraisonService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<BonLivraisonDto> create(@RequestBody BonLivraisonDto bonLivraisonDto) {
        return new ResponseEntity<>(bonLivraisonService.create(bonLivraisonDto), HttpStatus.CREATED);
    }

    @GetMapping("/{bonLivraisonId}")
    public ResponseEntity<BonLivraison> getById(@PathVariable("bonLivraisonId") long id) {
        return new ResponseEntity<>(bonLivraisonService.getById(id), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public  String delete(@PathVariable("id") long id){
        bonLivraisonService.delete(id);
        return "delete";
    }
    @PutMapping("/bonlivraison/{id}")
    public ResponseEntity<BonLivraisonDto> update(@PathVariable("id") long id, @RequestBody BonLivraisonDto bonLivraisonDto){
        return new ResponseEntity<>(bonLivraisonService.update(bonLivraisonDto, id), HttpStatus.UPGRADE_REQUIRED);
    }
}
