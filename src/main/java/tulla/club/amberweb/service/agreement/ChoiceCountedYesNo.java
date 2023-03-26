package tulla.club.amberweb.service.agreement;

import java.util.Map;

public class ChoiceCountedYesNo extends Decision {

    private int id;
    private Map<String, Counter> choice;  // <Choice, numberOfVotes>
}
