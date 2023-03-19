package tulla.club.amberweb.model.content;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "member")
public class Member implements IsContent {

    @Id
    @SequenceGenerator(
            name = "member_sequence",
            sequenceName = "member_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "member_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "nickname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String nickname;

    @Column(
            name = "subtitle",
            columnDefinition = "TEXT"
    )
    private String subtitle;

    /**
     * Optional one-to-one relationship.
     * https://www.baeldung.com/jpa-one-to-one
     */
    @OneToOne(mappedBy = "member")
    private RolesTable rolesTable;


    //
    // Constructors
    //

    public Member() {
    }

    // Die Datenbank wird für uns die ID generieren. Daher fehlt sie hier.
    public Member(String nickname,
                  String subtitle,
                  RolesTable rolesTable
                  ) {
        this.nickname = nickname;
        this.subtitle = subtitle;
        this.rolesTable = rolesTable;
    }

    public Member(Long id,
                  String nickname,
                  String subtitle,
                  RolesTable rolesTable
                  ) {
        this.id = id;
        this.nickname = nickname;
        this.subtitle = subtitle;
        this.rolesTable = rolesTable;
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


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }


    public RolesTable getRolesTable() {
        return rolesTable;
    }

    public void setRolesTable(RolesTable rolesTable) {
        this.rolesTable = rolesTable;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", rolesTable=" + rolesTable +
                '}';
    }
}
