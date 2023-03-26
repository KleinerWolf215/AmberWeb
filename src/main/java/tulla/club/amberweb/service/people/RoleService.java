package tulla.club.amberweb.service.people;

import org.springframework.stereotype.Service;
import tulla.club.amberweb.model.people.Role;

import java.util.List;

@Service
public class RoleService {

    public List<Role> getAllRoles() {
        return List.of(
                new Role(
                        "Buchführer",
                        null,
                        null,
                        null
                )
        );
    }
}
