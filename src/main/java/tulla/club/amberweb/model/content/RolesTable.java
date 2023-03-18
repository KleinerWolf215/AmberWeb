package tulla.club.amberweb.model.content;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(
            name = "role_id",
            updatable = false
    )
    private UUID id;

    @Column(
            name = "members_id",
            nullable = false
    )
    private Long membersId;

    @Column(
            name = "role_id",
            nullable = false
    )
    private UUID roleId;
}
