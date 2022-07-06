package ci.gs2e.dpi.inventor.entrepot.controller;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;
import ci.gs2e.dpi.inventor.entrepot.service.EntrepotService;
import com.google.inject.Inject;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("v1/entrepots")
@CrossOrigin
@AllArgsConstructor
public class EntrepotController {

    EntrepotService entrepotService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<EntrepotDto>> getAll() {
        return new ResponseEntity<>(entrepotService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<EntrepotDto> create(@RequestBody EntrepotDto entrepot) {
        return new ResponseEntity<>(entrepotService.create(entrepot), HttpStatus.CREATED);
    }

    @GetMapping("/{entrepotId}")
    public ResponseEntity<Entrepot> getById(@PathVariable("entrepotId") long id) {
        return new ResponseEntity<>(entrepotService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{entrepotName}")
    public ResponseEntity<Entrepot> getByName(@PathVariable("entrepotName") String name) {
        return new ResponseEntity<>(entrepotService.getByName(name), HttpStatus.FOUND);
    }
}
