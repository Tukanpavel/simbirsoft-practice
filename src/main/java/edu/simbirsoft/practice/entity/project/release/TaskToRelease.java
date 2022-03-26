package edu.simbirsoft.practice.entity.project.release;

import edu.simbirsoft.practice.entity.project.release.Release;
import edu.simbirsoft.practice.entity.project.release.TaskToReleaseKey;
import edu.simbirsoft.practice.entity.project.table.Task;

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

