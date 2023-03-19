package tulla.club.amberweb.controller.acts;

public class PublishAct extends AnyAct {
    // move to public - either new or from private

    //
    // Methods
    //

    @Override
    protected PublishAct createAct() {
        return new PublishAct();
    }

    @Override
    public String toString() {
        return "Act: Publish";
    }
}
