package tulla.club.amberweb.controller.acts;

import tulla.club.amberweb.model.decision.Decision;

public class DecideAct extends AnyAct {

    private Decision typeOfDecision;


    //
    // Constructor
    //



    //
    // Methods
    //

    @Override
    protected DecideAct createAct() {
        return new DecideAct();
    }

    @Override
    public String toString() {
        return "Act: Decision";
    }
}
