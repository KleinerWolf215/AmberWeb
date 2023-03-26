package tulla.club.amberweb.model.host.visualisation;

import jakarta.persistence.*;

@Entity
@Table(name = "COLOUR")
public class Colour {

    @Id
    @SequenceGenerator(
            name = "colour_sequence",
            sequenceName = "colour_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "colour_sequence"
    )
    @Column(
            name = "colour_id",
            updatable = false
    )
    private Long id;


    @Column(
            name = "colour_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String roleName;


    @Column(
            name = "red",
            nullable = false
    )
    private int red;

    @Column(
            name = "green",
            nullable = false
    )
    private int green;

    @Column(
            name = "blue",
            nullable = false
    )
    private int blue;


    //
    // Constructors
    //

    public Colour() {
    }

    public Colour(Long id, String roleName,
                  int red,
                  int green,
                  int blue) {
        this.id = id;
        this.roleName = roleName;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colour(String roleName,
                  int red,
                  int green,
                  int blue) {
        this.roleName = roleName;
        this.red = red;
        this.green = green;
        this.blue = blue;
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


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }


    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }


    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
