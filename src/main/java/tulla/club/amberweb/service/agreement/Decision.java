package tulla.club.amberweb.service.agreement;

import tulla.club.amberweb.service.scheduler.SchedulerType;
import tulla.club.amberweb.model.host.visualisation.Privacy;

public abstract class Decision {

    private int id;
    private SchedulerType type;  // TODO: Um bestimmte Entscheidungsarten konfigurieren zu können? (Richtung Datenbank)
    private String title;
    private String preDescription;
    private String postDescription;
    private DecisionResult result;
    private Privacy level;  // TODO: Oder reicht dies im Frame?

    // Evaluation
    private int minimumPercentageOfVotes;  // Maybe no decision has been made if not at least a minimum number of votes exist.
    private int numberOfDecision;  // How often a member can choose. E.g. every member has got two voting points to set on a choice of 8 items.
}
