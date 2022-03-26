package edu.simbirsoft.practice.entity.project.table;

import edu.simbirsoft.practice.entity.project.release.TaskToRelease;
import edu.simbirsoft.practice.entity.user.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Task {
    private Long id;

    @OneToOne
    private Table table;

    @OneToOne
    private User author;

    @Enumerated(value = EnumType.STRING)
    private TaskStatus status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private Set<TaskToRelease> taskToReleases;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private Set<TaskToUser> taskToUsers;

    public Task() {
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
