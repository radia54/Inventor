package ci.gs2e.dpi.inventor.AppSequence.controller;

import ci.gs2e.dpi.inventor.AppSequence.domain.AppSequence;
import ci.gs2e.dpi.inventor.AppSequence.domain.dto.AppSequenceDto;
import ci.gs2e.dpi.inventor.AppSequence.service.AppSequenceService;
import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonCommande.domain.dto.BonCommandeDto;
import ci.gs2e.dpi.inventor.entrepot.domain.dto.EntrepotDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/appsequence")
@CrossOrigin
@AllArgsConstructor
public class AppSequenceController {
    AppSequenceService appSequenceService;

    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<AppSequenceDto>> getAll() {
        return new ResponseEntity<>(appSequenceService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<AppSequenceDto> create(@RequestBody AppSequenceDto appSequenceDto) {
        return new ResponseEntity<>(appSequenceService.create(appSequenceDto), HttpStatus.CREATED);
    }

    @GetMapping("/{appsequenceId}")
    public ResponseEntity<AppSequence> getById(@PathVariable("appsequenceId") long id) {
        return new ResponseEntity<>(appSequenceService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{appsequenceName}")
    public ResponseEntity<AppSequence> getByName(@PathVariable("appsequenceName") String name) {
        return new ResponseEntity<>(appSequenceService.getByName(name), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        appSequenceService.delete(id);
        return "deleted";
    }
    @PutMapping("/appsequence/{id}")
    public ResponseEntity<AppSequenceDto> update(@PathVariable("id") long id, @RequestBody AppSequenceDto appSequenceDto){
        return new ResponseEntity<>(appSequenceService.update(appSequenceDto, id), HttpStatus.UPGRADE_REQUIRED);
    }


}
