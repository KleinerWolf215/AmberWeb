package tulla.club.amberweb.model.calendar;

import tulla.club.amberweb.model.content.Location;
import tulla.club.amberweb.model.content.Member;
import tulla.club.amberweb.model.decision.Decision;

public class Meeting {

    private int id;
    private String name;
    private Period period;
    private Location location;
    private Member contactPerson;
    private Decision agreements;
}
