package tulla.club.amberweb.model.calendar;

import tulla.club.amberweb.controller.Momentum;

public class Scheduler {

    private int id;
    private String name;
    private Period period;
    private Momentum whenActing;
    private Meeting workingObject;
    private SchedulerType act;
    private boolean isEnabled;
}
