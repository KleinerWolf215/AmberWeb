package tulla.club.amberweb.controller.acts;

public class InformAct extends AnyAct {  // It is a homepage - so concept is: one to many, always
    // move to private - if already published
    // Show private - if new

    //
    // Methods
    //

    @Override
    protected InformAct createAct() {
        return new InformAct();
    }

    @Override
    public String toString() {
        return "Act: Inform";
    }
}
