package edu.simbirsoft.practice.entity;

import javax.persistence.Table;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    private Long id;

    private String firstName;

    private String secondName;

    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<ProjectUserToRole> projectUserToRoles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<UserToRole> userToRoles;

    public User() {
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
