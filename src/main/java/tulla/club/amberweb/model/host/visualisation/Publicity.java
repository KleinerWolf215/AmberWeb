package tulla.club.amberweb.model.host.visualisation;

import jakarta.persistence.*;
import tulla.club.amberweb.model.people.Role;

import java.util.List;

@Entity
public class Publicity extends Role {

    @Column(
            name = "can_be_seen_above"
    )
    boolean canBeSeenAbove;

    @Column(
            name = "cannot_be_seen_below",
            nullable = false
    )
    boolean canBeSeenBelow;

    /**
     * One-to-Many relationship
     * https://www.baeldung.com/hibernate-one-to-many
     */
    @Column(
            name = "can_be_seen_by_roles",
            nullable = true
    )
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<Role> canBeSeenByThose;


    /**
     * One-to-Many relationship
     * https://www.baeldung.com/hibernate-one-to-many
     */
    @Column(
            name = "cannot_be_seen_by_roles",
            nullable = true
    )
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<Role> cannotBeSeenByThose;
}
