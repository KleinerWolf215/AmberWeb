package tulla.club.amberweb.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tulla.club.amberweb.model.content.Member;
import tulla.club.amberweb.model.content.Role;

import java.util.List;

//@Component() // Dies wird zu einer Bohne. Bedeutet, dass diese Klasse instanziiert werden muss (magisch, per Dependency Injection in Klasse MemberController)
@Service // spezifischer, aber eigentlich das gleiche wie @Component. Lesbarer.
public class MemberService {

    public List<Member> getAllMembers() {
        return List.of(
                new Member(
                        1L,
                        "Ichi",
                        "Trainer",
                        new Role(
                                "Buchführer",
                                "Das Wiesel"
                        )

                )
        );
    }
}
