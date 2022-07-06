package ci.gs2e.dpi.inventor.EmployeSite.controller;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.EmployeSite.domain.dto.EmployeSiteDto;
import ci.gs2e.dpi.inventor.EmployeSite.service.EmployeSiteService;
import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/employesite")
@CrossOrigin
@AllArgsConstructor
public class EmployeSiteController {
    EmployeSiteService employeSiteService;
    @GetMapping
    //@RolesAllowed("backend-user")
    public ResponseEntity<List<EmployeSiteDto>> getAll() {
        return new ResponseEntity<>(employeSiteService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping
    //@RolesAllowed("backend-admin")
    public ResponseEntity<EmployeSiteDto> create(@RequestBody EmployeSiteDto employeSite) {
        return new ResponseEntity<>(employeSiteService.create(employeSite), HttpStatus.CREATED);
    }

    @GetMapping("/{employeSiteId}")
    public ResponseEntity<EmployeSite> getById(@PathVariable("employeSiteId") long id) {
        return new ResponseEntity<>(employeSiteService.getById(id), HttpStatus.FOUND);
    }
/*
    @GetMapping("/{employeSiteName}")
    public ResponseEntity<EmployeSite> getByName(@PathVariable("employeSiteName") String name) {
        return new ResponseEntity<>(employeSiteService.getByName(name), HttpStatus.FOUND);
    }
    */


}
