package edu.simbirsoft.practice.entity.user.roles;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RoleToPermissionKey implements Serializable {
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "permissions_id")
    private Long permissionsId;
}
