package tulla.club.amberweb.model.calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

//@Entity
//@Table(name = "period")
public class Term {

    private int id;
    private LocalDateTime referenceDateTime;
    private Duration endOfPeriod;  // can be minus or plus
    private Period nextReferenceDateTime;  // null if not regularly
}
