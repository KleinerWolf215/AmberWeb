package tulla.club.amberweb.model.agreement;

import jakarta.persistence.*;
import tulla.club.amberweb.model.host.visualisation.Publicity;

import java.time.LocalDateTime;

@Entity
@Table(name = "AGREEMENT")
public class Agreement {

    @Id
    @SequenceGenerator(
            name = "agreement_sequence",
            sequenceName = "agreement_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "agreement_sequence"
    )
    @Column(
            name = "agreement_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "publicity",
            nullable = false
    )
    private Long roleId;

    @Column(
            name = "number_of_Yes",
            nullable = false
    )
    private int numberYes;

    @Column(
            name = "number_of_No",
            nullable = false
    )
    private int numberNo;

    @Column(
            name = "agreement_type",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String typeOfAgreement;

    @Column(
            name = "question",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String question;

    @Column(
            name = "agreement_dateTime",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    private LocalDateTime dateTime;

    /**
     * Unidirectional with foreign key
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publicity_id", referencedColumnName = "id")
    private Publicity publicity;

    //
    // Constructors
    //

    public Agreement() {
    }

    public Agreement(Long id,
                     Long roleId,
                     int numberYes,
                     int numberNo,
                     String typeOfAgreement,
                     String question,
                     LocalDateTime dateTime,
                     Publicity publicity) {
        this.id = id;
        this.roleId = roleId;
        this.numberYes = numberYes;
        this.numberNo = numberNo;
        this.typeOfAgreement = typeOfAgreement;
        this.question = question;
        this.dateTime = dateTime;
        this.publicity = publicity;
    }

    public Agreement(Long roleId,
                     int numberYes,
                     int numberNo,
                     String typeOfAgreement,
                     String question,
                     LocalDateTime dateTime,
                     Publicity publicity) {
        this.roleId = roleId;
        this.numberYes = numberYes;
        this.numberNo = numberNo;
        this.typeOfAgreement = typeOfAgreement;
        this.question = question;
        this.dateTime = dateTime;
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


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }


    public int getNumberYes() {
        return numberYes;
    }

    public void setNumberYes(int numberYes) {
        this.numberYes = numberYes;
    }


    public int getNumberNo() {
        return numberNo;
    }

    public void setNumberNo(int numberNo) {
        this.numberNo = numberNo;
    }


    public String getTypeOfAgreement() {
        return typeOfAgreement;
    }

    public void setTypeOfAgreement(String typeOfAgreement) {
        this.typeOfAgreement = typeOfAgreement;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
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
        return "Agreement{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", numberYes=" + numberYes +
                ", numberNo=" + numberNo +
                ", typeOfAgreement='" + typeOfAgreement + '\'' +
                ", question='" + question + '\'' +
                ", dateTime=" + dateTime +
                ", publicity=" + publicity +
                '}';
    }
}
