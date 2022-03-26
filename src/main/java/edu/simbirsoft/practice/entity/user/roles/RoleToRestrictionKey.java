package edu.simbirsoft.practice.entity.user.roles;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RoleToRestrictionKey implements Serializable {
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "restriction_id")
    private Long restrictionId;
}
