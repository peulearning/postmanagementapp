package com.example.postmanagementapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    private String username;

    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;


    // Constructor
    public User(Long id, String username, String password, Set<Post> posts) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.posts = posts;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }


}
