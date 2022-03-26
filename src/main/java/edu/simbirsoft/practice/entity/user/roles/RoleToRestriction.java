package edu.simbirsoft.practice.entity.user.roles;

import javax.persistence.*;

@Entity
public class RoleToRestriction {
    @EmbeddedId
    private RoleToRestrictionKey id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @MapsId("restrictionId")
    @JoinColumn(name = "restriction_id")
    private Restriction restriction;
}
