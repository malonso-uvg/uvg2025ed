package edu.uvg.example.model;

import java.util.List;

public abstract class User {

    //Constants
    public static byte STATUS_ACTIVE = 1;
    public static byte STATUS_INACTIVE = 0;
    public static byte TYPE_ADMIN = 0;
    public static byte TYPE_REGULAR = 1;

    //Atributes
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private byte status;
    protected byte type;

    // Constructor
    public User(String firstName, String lastName, String username, String password, byte status, byte type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.status = status;
        this.type = type;
    }

    // Getters and Setters
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getType() {
        return type;
    }

    // Method to validate credentials
    public boolean areValidCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Abstract method to get menu options
    public abstract List<String> getMenuOptions();
}

