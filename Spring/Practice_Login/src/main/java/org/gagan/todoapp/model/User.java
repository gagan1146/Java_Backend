package org.gagan.todoapp.model;

public class User {
    private String username;
    private String password;
    private String contactNumber;
    private String secret;

    public User(String username, String password, String contactNumber, String secret) {
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
        this.secret = secret;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
