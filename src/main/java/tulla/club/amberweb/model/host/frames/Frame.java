package tulla.club.amberweb.model.host.frames;

import jakarta.persistence.*;
import tulla.club.amberweb.model.host.visualisation.Visualisation;

@MappedSuperclass
public class Frame {

    @Id
    @SequenceGenerator(
            name = "frame_sequence",
            sequenceName = "frame_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "frame_sequence"
    )
    @Column(
            name = "frame_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "header",
            columnDefinition = "TEXT"
    )
    private String header;

    /**
     * Unidirectional with foreign key
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visualisation_id", referencedColumnName = "visual_id")
    private Visualisation visualisation;


    //
    // Constructors
    //

    public Frame() {
    }

    public Frame(Long id,
                 String header,
                 Visualisation visualisation) {
        this.id = id;
        this.header = header;
        this.visualisation = visualisation;
    }

    public Frame(String header,
                 Visualisation visualisation) {
        this.header = header;
        this.visualisation = visualisation;
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

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Visualisation getVisualisation() {
        return visualisation;
    }

    public void setVisualisation(Visualisation visualisation) {
        this.visualisation = visualisation;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Frame{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", visualisation=" + visualisation +
                '}';
    }
}
