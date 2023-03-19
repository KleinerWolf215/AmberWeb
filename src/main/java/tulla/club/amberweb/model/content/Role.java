package tulla.club.amberweb.model.content;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "role")
public class Role implements IsContent {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(
            name = "role_id",
            updatable = false
    )
    private UUID id;

    @Column(
            name = "role_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String roleName;

    @Column(
            name = "sub_role_id",
            nullable = true
    )
    private UUID subRoleId; // id of representative role


    //
    // Constructors
    //

    public Role() {
    }

    public Role(String roleName,
                UUID subRoleId) {
        this.roleName = roleName;
        this.subRoleId = subRoleId;
    }

    public Role(UUID id,
                String roleName,
                UUID subRoleId) {
        this.id = id;
        this.roleName = roleName;
        this.subRoleId = subRoleId;
    }


    //
    // Accessors
    //

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public UUID getSubRoleId() { return subRoleId; }

    public void setSubRoleId(UUID subRole) { this.subRoleId = subRole; }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", representative='" + subRoleId + '\'' +
                '}';
    }
}
