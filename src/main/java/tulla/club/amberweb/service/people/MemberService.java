package tulla.club.amberweb.service.people;

import org.springframework.stereotype.Service;
import tulla.club.amberweb.model.people.Member;

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
                        null
                )
        );
    }
}
