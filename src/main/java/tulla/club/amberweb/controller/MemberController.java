package tulla.club.amberweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tulla.club.amberweb.model.people.Member;
import tulla.club.amberweb.service.people.MemberService;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/member") // --> localhost:8080/api/v1/member
public class MemberController {

    private final MemberService memberService;

    //
    // Constructors
    //

    @Autowired  // D.h. hier muss Dependency Injection auf magische Weise zum Einsatz kommen.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    //
    // Methods
    //

    @GetMapping // Bedeutet, dass wir etwas aus unserem Web-Server herausbekommen wollen. Von hier.
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

}
