package edu.simbirsoft.practice.entity.user.roles;

import javax.persistence.*;

@Entity
public class Restriction {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}




