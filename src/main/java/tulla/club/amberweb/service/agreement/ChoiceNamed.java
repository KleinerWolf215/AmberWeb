package tulla.club.amberweb.service.agreement;

import tulla.club.amberweb.model.people.Member;

import java.util.List;
import java.util.Map;

public class ChoiceNamed {

    private int id;
    private Map<String, List<Member>> choice;  // <Choice, numberOfVotes>
}
