package tulla.club.amberweb.controller.acts;

public class ShowAct extends AnyAct {

    //
    // Methods
    //

    @Override
    protected ShowAct createAct() {
        return new ShowAct();
    }

    @Override
    public String toString() {
        return "Act: Show";
    }
}
