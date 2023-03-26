package tulla.club.amberweb.service.agreement;

public enum DecisionResult {
    UNDEFINED,
    SCHEDULED,
    DELAYED, // e.g. not all members where voting
    REJECTED,
    EVEN,
    ACCEPTED,
    OBSOLETE // no need to decide any more
}
