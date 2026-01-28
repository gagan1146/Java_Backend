package org.gagan.todoapp.model;

public class User {
    private String username;
    private String userId;
    private String password;

    public User(String username, String userId, String password) {
        this.username = username;
        this.userId = userId;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
