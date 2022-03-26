package edu.simbirsoft.practice.entity.project.release;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TaskToReleaseKey implements Serializable {
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "release_id")
    private Long releaseId;
}
