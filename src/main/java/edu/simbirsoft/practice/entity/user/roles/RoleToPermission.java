package edu.simbirsoft.practice.entity.user.roles;

import javax.persistence.*;

@Entity
public class RoleToPermission {
    @EmbeddedId
    private RoleToPermissionKey id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @MapsId("permissionsId")
    @JoinColumn(name = "permissions_id")
    private Permission permissions;
}
