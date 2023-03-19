package tulla.club.amberweb.controller.acts;

public class StoreAct extends AnyAct {

    //
    // Methods
    //

    @Override
    protected StoreAct createAct() {
        return new StoreAct();
    }

    @Override
    public String toString() {
        return "Act: Store";
    }
}
