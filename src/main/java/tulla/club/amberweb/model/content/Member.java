package tulla.club.amberweb.model.content;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "MEMBER")
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
            name = "member_id",
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

    @Column(
            name = "roles",
            nullable = true
    )
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    /**
     * One-to-Many relationship
     * https://www.baeldung.com/hibernate-one-to-many
     */
    private Set<Role> roles;


    //
    // Constructors
    //

    public Member() {
    }

    // Die Datenbank wird für uns die ID generieren. Daher fehlt sie hier.
    public Member(String nickname,
                  String subtitle,
                  Set<Role> roles
                  ) {
        this.nickname = nickname;
        this.subtitle = subtitle;
        this.roles = roles;
    }

    public Member(Long id,
                  String nickname,
                  String subtitle,
                  Set<Role> roles
                  ) {
        this.id = id;
        this.nickname = nickname;
        this.subtitle = subtitle;
        this.roles = roles;
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


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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
                ", roles=" + roles +
                '}';
    }
}
