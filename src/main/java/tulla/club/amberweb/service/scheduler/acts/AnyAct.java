package tulla.club.amberweb.service.scheduler.acts;

import tulla.club.amberweb.service.scheduler.SchedulerType;

public abstract class AnyAct {

    private int id;
    private String typeOfAct;

    //
    // Methods
    //

    /**
     * Factory Method, to create an Act according database setting.
     * @return A specific Act.
     */
    protected abstract AnyAct createAct();

    /**
     * Static Factory, to create, to create an Act according database setting.
     * @param type
     * @return
     */
    public static AnyAct getInstance(SchedulerType type) {
        switch (type) {
            case UNDEFINED -> {
                return null;  // TODO: DefaultAct ?
            }
            case DECIDE -> {
                return new DecideAct(); }  // TODO: Achtung, mindestens hier fehlen noch (Parameter- ?) Eingaben.
            case DELETE -> {
                return new DeleteAct(); }
            case INFORM -> {
                return new InformAct(); }
            case PUBLISH -> {
                return new PublishAct(); }
            case SCHEDULE -> {
                return new ScheduleAct(); }
            case SHIFT -> {
                return new ShiftAct(); }
            case SHOW -> {
                return new ShowAct(); }
            case STORE -> {
                return new StoreAct(); }
            default -> {
                return new DefaultAct();  // TODO: DefaultAct = LastAct ? A la Immutable, nur nicht zu viele individuelle Objekte produzierend?
            }
        }
    }
}
