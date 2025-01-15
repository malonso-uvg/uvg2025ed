package edu.uvg.example.model;

import java.util.ArrayList;
import java.util.List;

public class AdminUser extends User{

    // Constructor
    public AdminUser(String firstName, String lastName, String username, String password, byte status, byte type) {
        super(firstName, lastName, username, password, status, type);
    }

    public AdminUser(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password, STATUS_ACTIVE, TYPE_ADMIN);
    }
    
    // Abstract method to get menu options
    @Override
    public List<String> getMenuOptions(){
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Ver Datos");
        menuOptions.add("Actualizar datos");
        menuOptions.add("Salir");
        return menuOptions;
    }
}
