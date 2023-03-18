package tulla.club.amberweb.model.decision;

import java.util.Map;

public class ChoiceCounted extends Decision{

    private Map<String, Counter> choice;  // <Choice, numberOfVotes>
}
