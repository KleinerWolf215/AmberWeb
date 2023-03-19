package tulla.club.amberweb.model.decision;

import java.util.Map;

public class ChoiceCountedYesNo extends Decision{

    private int id;
    private Map<String, Counter> choice;  // <Choice, numberOfVotes>
}
