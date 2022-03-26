package edu.simbirsoft.practice.entity.user.roles;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Permission {
    private Long id;

    @OneToMany(mappedBy = "permission")
    private Set<RoleToPermission> roleToPermission;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

