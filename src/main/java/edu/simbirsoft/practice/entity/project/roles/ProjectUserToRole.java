package edu.simbirsoft.practice.entity.project.roles;

import edu.simbirsoft.practice.entity.project.Project;
import edu.simbirsoft.practice.entity.user.User;

import javax.persistence.*;

@Entity
public class ProjectUserToRole {
    @EmbeddedId
    private ProjectUserToRoleKey id;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("projectRoleId")
    @JoinColumn(name = "project_role_id")
    private ProjectRole projectRole;
}
