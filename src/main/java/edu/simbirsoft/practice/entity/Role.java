package edu.simbirsoft.practice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Role {
    @Id
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private Set<UserToRole> userToRoles;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
