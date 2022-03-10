package edu.simbirsoft.practice.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProjectRole {
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projectRole")
    private Set<ProjectUserToRole> projectUserToRoles;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
