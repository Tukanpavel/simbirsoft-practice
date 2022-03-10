package edu.simbirsoft.practice.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Project {
    private Long id;

    private Long creatorId;

    private LocalDateTime createdAt;

    private LocalDateTime editedAt;

    //TODO: make an enum for status
    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    private String name;


    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
    private Set<ProjectUserToRole> projectUserToRole;

    public Project() {
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(long creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(LocalDateTime editedAt) {
        this.editedAt = editedAt;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
