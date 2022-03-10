package edu.simbirsoft.practice.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Task {
    private Long id;

    @OneToOne
    private Table table;

    @OneToOne
    private User author;

    //TODO: add enum for statuses
    private String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private Set<TaskToRelease> taskToReleases;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private Set<TaskToUser> taskToUsers;

    public Task() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
