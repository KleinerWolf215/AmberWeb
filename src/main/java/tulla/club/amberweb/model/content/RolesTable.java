package tulla.club.amberweb.model.content;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * A member can have several roles.
 */
@Entity
@Table(name = "roles_table")
public class RolesTable {

    @Id
    @SequenceGenerator(
            name = "roles_table_sequence",
            sequenceName = "roles_table_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "roles_table_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long roleTableId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "eroles_table",
            joinColumns =
                    { @JoinColumn(name = "member_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "roles_table_id", referencedColumnName = "id") })
    private Member member;

    /**
     * One-to-Many relationship
     * https://www.baeldung.com/hibernate-one-to-many
     */
    @Column(
            name = "role_id",
            nullable = false
    )
    private UUID roleId;

    //
    // Constructors
    //


    public RolesTable() {
    }

    public RolesTable(Member member,
                      UUID roleId) {
        this.member = member;
        this.roleId = roleId;
    }

    public RolesTable(Long roleTableId,
                      Member member,
                      UUID roleId) {
        this.roleTableId = roleTableId;
        this.member = member;
        this.roleId = roleId;
    }


    //
    // Accesssors
    //


    public Long getRoleTableId() {
        return roleTableId;
    }

    public void setRoleTableId(Long roleTableId) {
        this.roleTableId = roleTableId;
    }


    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "RolesTable{" +
                "roleTableId=" + roleTableId +
                ", member=" + member +
                ", roleId=" + roleId +
                '}';
    }
}
