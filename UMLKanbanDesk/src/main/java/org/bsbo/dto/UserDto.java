package org.bsbo.dto;

import org.bsbo.domain.Role;
import org.bsbo.domain.Specialization;

import java.util.List;

public class UserDto {
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private Role role;
    List<Specialization> specializations;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public List<Specialization> getSpecializations() {
        return specializations;
    }
    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }
}
