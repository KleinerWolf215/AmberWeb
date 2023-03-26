package tulla.club.amberweb.model.host.visualisation;

import jakarta.persistence.*;

@Entity
@Table(name = "VISUALISATION")
public class Visualisation {

    @Id
    @SequenceGenerator(
            name = "visual_sequence",
            sequenceName = "member_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "visual_sequence"
    )
    @Column(
            name = "visual_id",
            updatable = false
    )
    private Long id;

    /**
     * Unidirectional with foreign key
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colour_id", referencedColumnName = "colour_id")
    private Colour colour;

    @Column(
            name = "imageFileName",
            columnDefinition = "TEXT"
    )
    private String imageFileName;

    @Column(
            name = "imageFilePath",
            columnDefinition = "TEXT"
    )
    private String imageFilePath;

    /**
     * Unidirectional with foreign key
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publicity_id", referencedColumnName = "id")
    private Publicity publicity;


    //
    // Constructors
    //

    public Visualisation() {
    }

    public Visualisation(Long id,
                         Colour colour,
                         String imageFileName,
                         String imageFilePath,
                         Publicity publicity) {
        this.id = id;
        this.colour = colour;
        this.imageFileName = imageFileName;
        this.imageFilePath = imageFilePath;
        this.publicity = publicity;
    }

    public Visualisation(Colour colour,
                         String imageFileName,
                         String imageFilePath,
                         Publicity publicity) {
        this.colour = colour;
        this.imageFileName = imageFileName;
        this.imageFilePath = imageFilePath;
        this.publicity = publicity;
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


    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }


    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }


    public String getImageFilePath() {
        return imageFilePath;
    }

    public void setImageFilePath(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }


    public Publicity getPublicity() {
        return publicity;
    }

    public void setPublicity(Publicity publicity) {
        this.publicity = publicity;
    }

    //
    // Constructors
    //

    @Override
    public String toString() {
        return "Visualisation{" +
                "id=" + id +
                ", colour=" + colour +
                ", imageFileName='" + imageFileName + '\'' +
                ", imageFilePath='" + imageFilePath + '\'' +
                ", publicity=" + publicity +
                '}';
    }
}
