package ci.gs2e.dpi.inventor.localisation.conntroller;

import ci.gs2e.dpi.inventor.entrepot.domain.Entrepot;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;
import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import ci.gs2e.dpi.inventor.localisation.domain.dto.LocalisationDto;
import ci.gs2e.dpi.inventor.localisation.service.LocalisationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/localisations")
@CrossOrigin
@AllArgsConstructor
public class LocalisationController {
    LocalisationService localisationService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<LocalisationDto>> getAll() {
        return new ResponseEntity<>(localisationService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<LocalisationDto> create(@RequestBody LocalisationDto localisation) {
        return new ResponseEntity<>(localisationService.create(localisation), HttpStatus.CREATED);
    }

    @GetMapping("/{localisationId}")
    public ResponseEntity<Localisation> getById(@PathVariable("entrepotId") long id) {
        return new ResponseEntity<>(localisationService.getById(id), HttpStatus.FOUND);
    }

    @PutMapping("/localisation/{id}")
    public ResponseEntity<LocalisationDto> update(@PathVariable("id") long id, @RequestBody LocalisationDto localisationDto){
        return  new ResponseEntity<>(localisationService.update(localisationDto, id), HttpStatus.UPGRADE_REQUIRED);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        localisationService.delete(id);
        return "deleted";
    }
/*
    @GetMapping("/{localisationName}")
    public ResponseEntity<Localisation> getByName(@PathVariable("localisationName") String name) {
        return new ResponseEntity<>(localisationService.getByName(name), HttpStatus.FOUND);
    }
*/

}
