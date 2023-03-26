package tulla.club.amberweb.model.calendar;

import jakarta.persistence.*;
import tulla.club.amberweb.dao.IsContent;
import tulla.club.amberweb.model.host.visualisation.Publicity;

@Entity
@Table(name = "MEETING")
public class Meeting implements IsContent {

    @Id
    @SequenceGenerator(
            name = "meeting_sequence",
            sequenceName = "meeting_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "meeting_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "purpose",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String purpose;

    @Column(
            name = "term_id",
            nullable = false
    )
    private Long termId;

    @Column(
            name = "location_id",
            nullable = false
    )
    private Long locationId;

    @Column(
            name = "calling_member_id",
            nullable = false
    )
    private Long callingMemberId;

    /**
     * Unidirectional with foreign key
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publicity_id", referencedColumnName = "id")
    private Publicity publicity;


    //
    // Constructors
    //

    public Meeting() {
    }

    public Meeting(Long id,
                   String purpose,
                   Long termId,
                   Long locationId,
                   Long callingMemberId,
                   Publicity publicity) {
        this.id = id;
        this.purpose = purpose;
        this.termId = termId;
        this.locationId = locationId;
        this.callingMemberId = callingMemberId;
        this.publicity = publicity;
    }

    public Meeting(String purpose,
                   Long termId,
                   Long locationId,
                   Long callingMemberId,
                   Publicity publicity) {
        this.purpose = purpose;
        this.termId = termId;
        this.locationId = locationId;
        this.callingMemberId = callingMemberId;
        this.publicity = publicity;
    }

    //
    // Accesssors
    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }


    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }


    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }


    public Long getCallingMemberId() {
        return callingMemberId;
    }

    public void setCallingMemberId(Long callingMemberId) {
        this.callingMemberId = callingMemberId;
    }

    public Publicity getPublicity() {
        return publicity;
    }

    public void setPublicity(Publicity publicity) {
        this.publicity = publicity;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", purpose='" + purpose + '\'' +
                ", termId=" + termId +
                ", locationId=" + locationId +
                ", callingMemberId=" + callingMemberId +
                ", publicity=" + publicity +
                '}';
    }
}
