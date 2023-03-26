package tulla.club.amberweb.model.host;

import jakarta.persistence.*;
import tulla.club.amberweb.model.host.frames.CollectionFrame;
import tulla.club.amberweb.model.host.visualisation.Visualisation;

public class Host {

    @Id
    @SequenceGenerator(
            name = "member_sequence",
            sequenceName = "host_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "host_sequence"
    )
    @Column(
            name = "host_id",
            updatable = false
    )
    private Long id;

    /**
     * Unidirectional with foreign key
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visualisation_id", referencedColumnName = "visual_id")
    private Visualisation visualisation;

    /**
     * Unidirectional with foreign key
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "visualisation_id", referencedColumnName = "visual_id")
    private CollectionFrame frames;


    //
    // Constructors
    //

    public Host() {
    }

    public Host(Long id,
                Visualisation visualisation,
                CollectionFrame frames) {
        this.id = id;
        this.visualisation = visualisation;
        this.frames = frames;
    }

    public Host(Visualisation visualisation,
                CollectionFrame frames) {
        this.visualisation = visualisation;
        this.frames = frames;
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

    public Visualisation getVisualisation() {
        return visualisation;
    }

    public void setVisualisation(Visualisation visualisation) {
        this.visualisation = visualisation;
    }

    public CollectionFrame getFrames() {
        return frames;
    }

    public void setFrames(CollectionFrame frames) {
        this.frames = frames;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Host{" +
                "id=" + id +
                ", visualisation=" + visualisation +
                ", frames=" + frames +
                '}';
    }
}
