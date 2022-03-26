package edu.simbirsoft.practice.entity.project.table;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TaskToUserKey implements Serializable {
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "user_id")
    private Long userId;
}
