package edu.simbirsoft.practice.entity.project.release;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Release {
    private Long id;

    private String version;

    private LocalDateTime start;

    private LocalDateTime end;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "release")
    private Set<TaskToRelease> taskToReleases;

    public Release() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
