package com.faisaljarkass.demo.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Entity
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private ArrayList roles;

    public MyUser() {
    }

    public MyUser(Long id, String username, String password, ArrayList roles, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        roles.add(role);
    }

    public MyUser(Long id, String username, String password, ArrayList roles, String role1, String role2) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        roles.add(role1);
        roles.add(role2);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getRoles() {

        return roles;
    }

    public void setRoles(ArrayList roles) {

        this.roles = roles;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyUser myUser = (MyUser) o;

        if (id != null ? !id.equals(myUser.id) : myUser.id != null) return false;
        if (username != null ? !username.equals(myUser.username) : myUser.username != null) return false;
        if (password != null ? !password.equals(myUser.password) : myUser.password != null) return false;
        return roles != null ? roles.equals(myUser.roles) : myUser.roles == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }
}
