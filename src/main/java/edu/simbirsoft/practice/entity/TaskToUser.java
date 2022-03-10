package edu.simbirsoft.practice.entity;

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


