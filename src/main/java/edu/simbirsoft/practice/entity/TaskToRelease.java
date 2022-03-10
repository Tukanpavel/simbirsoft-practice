package edu.simbirsoft.practice.entity;

import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "_task_to_release")
public class TaskToRelease {
    @EmbeddedId
    private TaskToReleaseKey id;

    @ManyToOne
    @MapsId("taskId")
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne
    @MapsId("releaseId")
    @JoinColumn(name = "release_id")
    private Release release;
}

