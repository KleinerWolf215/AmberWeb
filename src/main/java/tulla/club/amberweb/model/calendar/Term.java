package tulla.club.amberweb.model.calendar;

import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

@Entity
@Table(name = "TERM")
public class Term {

    @Id
    @SequenceGenerator(
            name = "term_sequence",
            sequenceName = "term_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "term_sequence"
    )
    @Column(
            name = "term_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "pinpoint_date_time",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    private LocalDateTime pinpointDateTime;

    @Column(
            name = "end_of_period",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    private Duration endOfPeriod;  // can be minus or plus

    @Column(
            name = "next_reference_date",
            columnDefinition = "DATE"
    )
    private Period nextReferenceDateTime;  // null if not regularly


    //
    // Constructors
    //

    public Term() {
    }

    public Term(LocalDateTime pinpointDateTime,
                Duration endOfPeriod,
                Period nextReferenceDateTime) {
        this.pinpointDateTime = pinpointDateTime;
        this.endOfPeriod = endOfPeriod;
        this.nextReferenceDateTime = nextReferenceDateTime;
    }

    public Term(Long id,
                LocalDateTime pinpointDateTime,
                Duration endOfPeriod,
                Period nextReferenceDateTime) {
        this.id = id;
        this.pinpointDateTime = pinpointDateTime;
        this.endOfPeriod = endOfPeriod;
        this.nextReferenceDateTime = nextReferenceDateTime;
    }


    //
    // Accessors
    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getPinpointDateTime() {
        return pinpointDateTime;
    }

    public void setPinpointDateTime(LocalDateTime pinpointDateTime) {
        this.pinpointDateTime = pinpointDateTime;
    }


    public Duration getEndOfPeriod() {
        return endOfPeriod;
    }

    public void setEndOfPeriod(Duration endOfPeriod) {
        this.endOfPeriod = endOfPeriod;
    }


    public Period getNextReferenceDateTime() {
        return nextReferenceDateTime;
    }

    public void setNextReferenceDateTime(Period nextReferenceDateTime) {
        this.nextReferenceDateTime = nextReferenceDateTime;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", pinpointDateTime=" + pinpointDateTime +
                ", endOfPeriod=" + endOfPeriod +
                ", nextReferenceDateTime=" + nextReferenceDateTime +
                '}';
    }
}
