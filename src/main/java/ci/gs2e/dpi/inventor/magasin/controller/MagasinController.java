package ci.gs2e.dpi.inventor.magasin.controller;

import ci.gs2e.dpi.inventor.magasin.domain.Magasin;
import ci.gs2e.dpi.inventor.magasin.domain.dto.MagasinDto;
import ci.gs2e.dpi.inventor.magasin.service.MagasinService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("v1/magasins")
@CrossOrigin
@AllArgsConstructor
public class MagasinController {

    MagasinService magasinService;

    @GetMapping
    @RolesAllowed("backend-user")
    public ResponseEntity<List<MagasinDto>> getAll() {
        return new ResponseEntity<>(magasinService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
   // @RolesAllowed("backend-admin")
    public ResponseEntity<MagasinDto> create(@RequestBody MagasinDto magasin) {
        return new ResponseEntity<>(magasinService.create(magasin), HttpStatus.CREATED);
    }

    @GetMapping("/{magasinId}")
    public ResponseEntity<Magasin> getById(@PathVariable("magasinId") long id) {
        return new ResponseEntity<>(magasinService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{magasinName}")
    public ResponseEntity<Magasin> getByName(@PathVariable("magasinName") String name) {
        return new ResponseEntity<>(magasinService.getByName(name), HttpStatus.FOUND);
    }
}
