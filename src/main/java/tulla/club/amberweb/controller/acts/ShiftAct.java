package tulla.club.amberweb.controller.acts;

public class Shift extends Act{
    // Life-Cycle:
    //   private:  create new --> config (schedule, publicity) --> show (auto pop up  or  immediately ; ... until end of schedule --> move to private; ... until end of schedule --> delete;

    //
    // Methods
    //

    @Override
    public String toString() {
        return "Act: Shift";
    }
}
