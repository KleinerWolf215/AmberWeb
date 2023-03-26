package tulla.club.amberweb.service.scheduler.acts;

public class DeleteAct extends AnyAct {

    //
    // Methods
    //

    @Override
    protected DeleteAct createAct() {
        return new DeleteAct();
    }


    @Override
    public String toString() {
        return "Act: Delete";
    }
}
