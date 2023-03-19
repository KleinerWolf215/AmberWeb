package tulla.club.amberweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tulla.club.amberweb.model.content.Role;
import tulla.club.amberweb.service.RoleService;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/role") // --> localhost:8080/api/v1/role
public class RoleController {

    private final RoleService roleService;

    //
    // Constructor
    //

    @Autowired  // D.h. hier muss Dependency Injection auf magische Weise zum Einsatz kommen.
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }


    //
    // Methods
    //

    @GetMapping // Bedeutet, dass wir etwas aus unserem Web-Server herausbekommen wollen. Von hier.
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }
}
