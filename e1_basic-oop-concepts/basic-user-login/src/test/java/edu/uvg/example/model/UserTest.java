package edu.uvg.example.model;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.List;

public class UserTest {

    @Test
    public void testRegularUserMenuOptions() {
        User regularUser = new RegularUser("John", "Doe", "johndoe", "password123");
        List<String> menuOptions = regularUser.getMenuOptions();

        assertNotNull(menuOptions);
        assertEquals(6, menuOptions.size());
        assertTrue(menuOptions.contains("Ver Datos"));
        assertTrue(menuOptions.contains("Actualizar datos"));
        assertTrue(menuOptions.contains("Ver todos los usuarios"));
        assertTrue(menuOptions.contains("Crear usuario"));
        assertTrue(menuOptions.contains("Editar Usuario"));
        assertTrue(menuOptions.contains("Salir"));
    }

    @Test
    public void testAdminUserMenuOptions() {
        User adminUser = new AdminUser("Admin", "User", "adminuser", "adminpass");
        List<String> menuOptions = adminUser.getMenuOptions();

        assertNotNull(menuOptions);
        assertEquals(3, menuOptions.size());
        assertTrue(menuOptions.contains("Ver Datos"));
        assertTrue(menuOptions.contains("Actualizar datos"));
        assertTrue(menuOptions.contains("Salir"));
    }

    @Test
    public void testValidCredentials() {
        User user = new RegularUser("John", "Doe", "johndoe", "password123");
        assertTrue(user.areValidCredentials("johndoe", "password123"));
        assertFalse(user.areValidCredentials("johndoe", "wrongpassword"));
        assertFalse(user.areValidCredentials("wronguser", "password123"));
    }

    @Test
    public void testSetAndGetAttributes() {
        User user = new RegularUser("John", "Doe", "johndoe", "password123");

        user.setFirstName("Jane");
        assertEquals("Jane", user.getFirstName());

        user.setLastName("Smith");
        assertEquals("Smith", user.getLastName());

        user.setUsername("janesmith");
        assertEquals("janesmith", user.getUsername());

        user.setPassword("newpassword");
        assertEquals("newpassword", user.getPassword());

        user.setStatus(User.STATUS_INACTIVE);
        assertEquals(User.STATUS_INACTIVE, user.getStatus());
    }

    @Test
    public void testUserType() {
        User regularUser = new RegularUser("John", "Doe", "johndoe", "password123");
        assertEquals(User.TYPE_REGULAR, regularUser.getType());

        User adminUser = new AdminUser("Admin", "User", "adminuser", "adminpass");
        assertEquals(User.TYPE_ADMIN, adminUser.getType());
    }
}
