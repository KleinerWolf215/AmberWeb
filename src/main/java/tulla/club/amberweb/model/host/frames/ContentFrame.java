package tulla.club.amberweb.model.host.frames;

import jakarta.persistence.*;
import tulla.club.amberweb.model.host.visualisation.Visualisation;

@Entity
@Table(name = "CONTENT_FRAME")
public class ContentFrame extends Frame{

    @Id
    @SequenceGenerator(
            name = "contend_sequence",
            sequenceName = "contend_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contend_sequence"
    )
    @Column(
            name = "contend_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "content_text",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String contendText;

    @Column(
            name = "hover_text",
            columnDefinition = "TEXT"
    )
    private String hoverText;

    @Column(
            name = "vertical_alignment",
            columnDefinition = "TEXT"
    )
    private String verticalAlignment;

    @Column(
            name = "horizontal_alignment",
            columnDefinition = "TEXT"
    )
    private String horizontalAlignment;


    //
    // Constructors
    //

    public ContentFrame() {
    }

    public ContentFrame(Long id,
                        String header,
                        Visualisation visualisation) {
        super(id, header, visualisation);
    }

    public ContentFrame(String header,
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


    public String getContendText() {
        return contendText;
    }

    public void setContendText(String contendText) {
        this.contendText = contendText;
    }


    public String getHoverText() {
        return hoverText;
    }

    public void setHoverText(String hoverText) {
        this.hoverText = hoverText;
    }


    public String getVerticalAlignment() {
        return verticalAlignment;
    }

    public void setVerticalAlignment(String verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }


    public String getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public void setHorizontalAlignment(String horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "ContentFrame{" +
                "id=" + id +
                ", contendText='" + contendText + '\'' +
                ", hoverText='" + hoverText + '\'' +
                ", verticalAlignment='" + verticalAlignment + '\'' +
                ", horizontalAlignment='" + horizontalAlignment + '\'' +
                '}';
    }

}
