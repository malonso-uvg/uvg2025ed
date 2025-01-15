package edu.uvg.example.model;

import java.util.ArrayList;
import java.util.List;

public class RegularUser extends User{

    // Constructor
    public RegularUser(String firstName, String lastName, String username, String password, byte status, byte type) {
        super(firstName, lastName, username, password, status, type);
    }

    public RegularUser(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password, STATUS_ACTIVE, TYPE_REGULAR);
    }
    
    // Abstract method to get menu options
    @Override
    public List<String> getMenuOptions(){
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Ver Datos");
        menuOptions.add("Actualizar datos");
        menuOptions.add("Ver todos los usuarios");
        menuOptions.add("Crear usuario");
        menuOptions.add("Editar Usuario");
        menuOptions.add("Salir");
        return menuOptions;
    }
}
