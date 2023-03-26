package tulla.club.amberweb.model.people;

import jakarta.persistence.*;
import tulla.club.amberweb.dao.IsContent;

@Entity
@Table(name = "CONTACT")
public class Contact implements IsContent {

    @Id
    @SequenceGenerator(
            name = "contact_sequence",
            sequenceName = "contact_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contact_sequence"
    )
    @Column(
            name = "contact_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "first_phone_number",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstPhoneNumber;

    @Column(
            name = "second_phone_number",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String secondPhoneNumber;

    @Column(
            name = "internet_address",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String internetAddress;

    @OneToOne(optional =  true, fetch = FetchType.LAZY)
    @MapsId
    private Location location;


    //
    // Constructors
    //

    public Contact() {
    }

    public Contact(String firstPhoneNumber,
                   String secondPhoneNumber,
                   String internetAddress,
                   Location location) {
        this.firstPhoneNumber = firstPhoneNumber;
        this.secondPhoneNumber = secondPhoneNumber;
        this.internetAddress = internetAddress;
        this.location = location;
    }

    public Contact(Long id,
                   String firstPhoneNumber,
                   String secondPhoneNumber,
                   String internetAddress,
                   Location location) {
        this.id = id;
        this.firstPhoneNumber = firstPhoneNumber;
        this.secondPhoneNumber = secondPhoneNumber;
        this.internetAddress = internetAddress;
        this.location = location;
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


    public String getFirstPhoneNumber() {
        return firstPhoneNumber;
    }

    public void setFirstPhoneNumber(String firstPhoneNumber) {
        this.firstPhoneNumber = firstPhoneNumber;
    }


    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }


    public String getInternetAddress() {
        return internetAddress;
    }

    public void setInternetAddress(String internetAddress) {
        this.internetAddress = internetAddress;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstPhoneNumber='" + firstPhoneNumber + '\'' +
                ", secondPhoneNumber='" + secondPhoneNumber + '\'' +
                ", internetAddress='" + internetAddress + '\'' +
                ", location=" + location +
                '}';
    }
}
