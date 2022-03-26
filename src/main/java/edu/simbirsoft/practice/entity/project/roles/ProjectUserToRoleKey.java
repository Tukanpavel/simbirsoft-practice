package edu.simbirsoft.practice.entity.project.roles;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProjectUserToRoleKey implements Serializable {
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "project_role_id")
    private Long projectRoleId;
}
