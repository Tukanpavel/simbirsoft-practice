package edu.simbirsoft.practice.entity.project.table;

import edu.simbirsoft.practice.entity.user.User;

import javax.persistence.*;

@Entity
public class TaskToUser {
    @EmbeddedId
    private TaskToUserKey id;

    @ManyToOne
    @MapsId("taskId")
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;
}


