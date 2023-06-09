package tulla.club.amberweb.model.scheduler;

import tulla.club.amberweb.model.calendar.Meeting;
import tulla.club.amberweb.service.scheduler.Momentum;
import tulla.club.amberweb.service.scheduler.SchedulerType;

import java.time.Period;

public class Scheduler {

    private int id;
    private String name;
    private Period period;
    private Momentum whenActing;
    private Meeting workingObject;
    private SchedulerType act;
    private boolean isEnabled;
}
