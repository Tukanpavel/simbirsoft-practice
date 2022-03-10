package edu.simbirsoft.practice.entity;

import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "_user_to_role")
public class UserToRole {
    @EmbeddedId
    private UserToRoleKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    private Role role;
}

