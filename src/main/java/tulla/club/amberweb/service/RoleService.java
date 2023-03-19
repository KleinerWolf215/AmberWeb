package tulla.club.amberweb.service;

import org.springframework.stereotype.Service;
import tulla.club.amberweb.model.content.Role;

import java.util.List;

@Service
public class RoleService {

    public List<Role> getAllRoles() {
        return List.of(
                new Role(
                        "Buchführer",
                        null
                )
        );
    }
}
