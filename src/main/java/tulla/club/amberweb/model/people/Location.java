package tulla.club.amberweb.model.people;

import jakarta.persistence.*;
import tulla.club.amberweb.dao.IsContent;

@Entity
@Table(name = "LOCATION")
public class Location implements IsContent {

    @Id
    @SequenceGenerator(
            name = "location_sequence",
            sequenceName = "location_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "location_sequence"
    )
    @Column(
            name = "location_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "street",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String street;

    @Column(
            name = "house_number",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String houseNumber;

    @Column(
            name = "town",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String town;

    @Column(
            name = "postal_code",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String postalCode;

    @Column(
            name = "country",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String country;  // e.g. shown on surface only if differing from Germany


    //
    // Constructors
    //

    public Location() {
    }

    public Location(String name,
                    String street,
                    String houseNumber,
                    String town,
                    String postalCode,
                    String country) {
        this.name = name;
        this.street = street;
        this.houseNumber = houseNumber;
        this.town = town;
        this.postalCode = postalCode;
        this.country = country;
    }

    public Location(Long id,
                    String name,
                    String street,
                    String houseNumber,
                    String town,
                    String postalCode,
                    String country) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.houseNumber = houseNumber;
        this.town = town;
        this.postalCode = postalCode;
        this.country = country;
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }


    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


    public String getPlz() {
        return postalCode;
    }

    public void setPlz(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", town='" + town + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
