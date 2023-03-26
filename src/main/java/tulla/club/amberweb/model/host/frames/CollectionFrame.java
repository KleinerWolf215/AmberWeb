package tulla.club.amberweb.model.host.frames;

import jakarta.persistence.*;
import tulla.club.amberweb.model.host.visualisation.Visualisation;

@Entity
@Table(name = "COLLECTION_FRAME")
public class CollectionFrame extends Frame {

    @Id
    @SequenceGenerator(
            name = "collection_sequence",
            sequenceName = "collectin_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "collection_sequence"
    )
    @Column(
            name = "collection_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "property_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String property;

    @Column(
            name = "direction",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String direction;

    @Column(
            name = "strategy_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String strategy_name;

    //
    // Constructors
    //


    public CollectionFrame() {
    }

    public CollectionFrame(Long id,
                           String header,
                           Visualisation visualisation) {
        super(id, header, visualisation);
    }

    public CollectionFrame(String header,
                           Visualisation visualisation) {
        super(header, visualisation);
    }


    //
    // Accesssors
    //

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }


    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }


    public String getStrategy_name() {
        return strategy_name;
    }

    public void setStrategy_name(String strategy_name) {
        this.strategy_name = strategy_name;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "CollectionFrame{" +
                "id=" + id +
                ", property='" + property + '\'' +
                ", direction='" + direction + '\'' +
                ", strategy_name='" + strategy_name + '\'' +
                '}';
    }
}
