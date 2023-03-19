package tulla.club.amberweb.model.content;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "ROLE")
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

    @OneToOne(optional = true)
    @JoinColumn(name = "higher_role_id")
    private Role higherRole;

    @OneToOne(mappedBy = "higherRole", optional = true)
    private Role lowerRole;

    @OneToOne(optional =  true)
    @MapsId
    private Contact contact;


    //
    // Constructors
    //

    public Role() {
    }

    public Role(UUID id,
                String roleName,
                Role higherRole,
                Role lowerRole,
                Contact contact) {
        this.id = id;
        this.roleName = roleName;
        this.higherRole = higherRole;
        this.lowerRole = lowerRole;
        this.contact = contact;
    }

    public Role(String roleName,
                Role higherRole,
                Role lowerRole,
                Contact contact) {
        this.roleName = roleName;
        this.higherRole = higherRole;
        this.lowerRole = lowerRole;
        this.contact = contact;
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


    public Role getHigherRole() {
        return higherRole;
    }

    public void setHigherRole(Role higherRole) {
        if (higherRole.getId() == this.getId()){
            throw new IllegalArgumentException("Referencing itself is not allowed.");
        }
        this.higherRole = higherRole;
    }


    public Role getLowerRole() {
        return lowerRole;
    }

    public void setLowerRole(Role lowerRole) {
        if (higherRole.getId() == this.getId()){
            throw new IllegalArgumentException("Referencing itself is not allowed.");
        }
        this.lowerRole = lowerRole;
    }


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


    //
    // Methods
    //

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", higherRole=" + higherRole +
                ", lowerRole=" + lowerRole +
                ", contact=" + contact +
                '}';
    }
}
