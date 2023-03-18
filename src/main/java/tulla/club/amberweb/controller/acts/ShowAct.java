package tulla.club.amberweb.controller.acts;

public class Act extends AnyAct {

    //
    // Methods
    //

    @Override
    public Act createAct() {
        return new Act();
    }

    @Override
    public String toString() {
        return "Act: Show";
    }
}
