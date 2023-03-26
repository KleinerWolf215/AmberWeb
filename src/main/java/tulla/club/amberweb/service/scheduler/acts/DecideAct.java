package tulla.club.amberweb.service.scheduler.acts;

import tulla.club.amberweb.service.agreement.Decision;

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
