package tulla.club.amberweb.model.decision;

import tulla.club.amberweb.model.content.Member;

import java.util.List;
import java.util.Map;

public class ChoiceNamed {

    private int id;
    private Map<String, List<Member>> choice;  // <Choice, numberOfVotes>
}
