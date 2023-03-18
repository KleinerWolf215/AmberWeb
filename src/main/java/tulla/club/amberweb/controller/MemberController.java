package tulla.club.amberweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tulla.club.amberweb.model.content.Member;
import tulla.club.amberweb.model.content.Role;

import java.util.List;

@RestController
public class MemberControler {

    @GetMapping // Bedeutet, dass wir etwas aus unserem Web-Server herausbekommen wollen. Von hier.
    public List<Member> showMembers() {
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
