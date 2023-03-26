package tulla.club.amberweb.service.scheduler.acts;

public class ScheduleAct extends AnyAct {

    //
    // Methods
    //

    @Override
    public ScheduleAct createAct() {
        return new ScheduleAct();
    }

    @Override
    public String toString() {
        return "Act: Schedule";
    }
}
