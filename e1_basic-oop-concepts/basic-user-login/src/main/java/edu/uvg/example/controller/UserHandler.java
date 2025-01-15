package edu.uvg.example.controller;

import edu.uvg.example.model.AdminUser;
import edu.uvg.example.model.RegularUser;
import edu.uvg.example.model.User;

public class UserHandler {
    
    public static User createUser(String firstName, String lastName, String username, String password, byte type){
        User newUser = null;

        if (type == User.TYPE_ADMIN){
            newUser = new AdminUser(firstName, lastName, username, password);
        } else if (type == User.TYPE_REGULAR){
            newUser = new RegularUser(firstName, lastName, username, password);
        } else {
            newUser = new RegularUser(firstName, lastName, username, password);
        }
        
        return newUser;
    }

    public static boolean areValidCredentials(User user, String username, String password, IHashCreator hashMethod){
        return user.getUsername().equals(username) 
        && user.getPassword().equals(hashMethod.getHashFromString(password));
    }
}
