package ci.gs2e.dpi.inventor.employe.controller;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;
import ci.gs2e.dpi.inventor.employe.service.EmployeService;
import ci.gs2e.dpi.inventor.localisation.domain.Localisation;
import ci.gs2e.dpi.inventor.localisation.domain.dto.LocalisationDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/employes")
@CrossOrigin
@AllArgsConstructor
public class EmployeController {
    EmployeService employeService;
    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<EmployeDto>> getAll() {
        return new ResponseEntity<>(employeService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<EmployeDto> create(@RequestBody EmployeDto employe) {
        return new ResponseEntity<>(employeService.create(employe), HttpStatus.CREATED);
    }

    @GetMapping("/{employeId}")
    public ResponseEntity<Employe> getById(@PathVariable("employeId") long id) {
        return new ResponseEntity<>(employeService.getById(id), HttpStatus.FOUND);
    }

    @GetMapping("/{employeName}")
    public ResponseEntity<Employe> getByName(@PathVariable("employeName") String name) {
        return new ResponseEntity<>(employeService.getByName(name), HttpStatus.FOUND);
    }

}
