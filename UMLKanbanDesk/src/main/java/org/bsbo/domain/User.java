package org.bsbo.domain;

import org.bsbo.Abstract.AbstractEntity;

import java.awt.*;
import java.util.ArrayList;

public class User extends AbstractEntity {
    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddlName() {
        return middlName;
    }

    public void setMiddlName(String middlName) {
        this.middlName = middlName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    

    private String firstName;
    private String middlName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private ArrayList<Specialization> specializations;
}
