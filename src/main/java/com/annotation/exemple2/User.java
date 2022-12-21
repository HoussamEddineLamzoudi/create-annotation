package com.annotation.exemple2;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table (name = "users", schema = "public", catalog = "db_anotation")
public class User {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id()
    private int id;
    @Basic
    @Column (name = "username")
    private String username;
    @Basic
    @Column (name = "email")
    private String email;
    @Basic
    @Column (name = "password")
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

