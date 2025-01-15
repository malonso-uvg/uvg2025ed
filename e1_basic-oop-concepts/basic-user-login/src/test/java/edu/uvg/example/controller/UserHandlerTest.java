package edu.uvg.example.controller;

import static org.junit.Assert.*;

import edu.uvg.example.model.AdminUser;
import edu.uvg.example.model.RegularUser;
import edu.uvg.example.model.User;
import org.junit.Test;

public class UserHandlerTest {

    @Test
    public void testCreateUserAdmin() {
        User user = UserHandler.createUser("Admin", "User", "adminuser", "adminpass", User.TYPE_ADMIN);
        assertNotNull(user);
        assertTrue(user instanceof AdminUser);
        assertEquals("Admin", user.getFirstName());
        assertEquals("User", user.getLastName());
        assertEquals("adminuser", user.getUsername());
        assertEquals("adminpass", user.getPassword());
        assertEquals(User.TYPE_ADMIN, user.getType());
    }

    @Test
    public void testCreateUserRegular() {
        User user = UserHandler.createUser("John", "Doe", "johndoe", "password123", User.TYPE_REGULAR);
        assertNotNull(user);
        assertTrue(user instanceof RegularUser);
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("johndoe", user.getUsername());
        assertEquals("password123", user.getPassword());
        assertEquals(User.TYPE_REGULAR, user.getType());
    }

    @Test
    public void testAreValidCredentialsMD5() {
        IHashCreator md5HashCreator = new MD5HashCreator();
        User user = UserHandler.createUser("John", "Doe", "johndoe", "5f4dcc3b5aa765d61d8327deb882cf99", User.TYPE_REGULAR); // "password" in MD5

        assertTrue(UserHandler.areValidCredentials(user, "johndoe", "password", md5HashCreator));
        assertFalse(UserHandler.areValidCredentials(user, "johndoe", "wrongpassword", md5HashCreator));
        assertFalse(UserHandler.areValidCredentials(user, "wronguser", "password", md5HashCreator));
    }

    @Test
    public void testAreValidCredentialsSHA1() {
        IHashCreator sha1HashCreator = new SHA1HashCreator();
        User user = UserHandler.createUser("Admin", "User", "adminuser", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", User.TYPE_ADMIN); // "password" in SHA-1

        assertTrue(UserHandler.areValidCredentials(user, "adminuser", "password", sha1HashCreator));
        assertFalse(UserHandler.areValidCredentials(user, "adminuser", "wrongpassword", sha1HashCreator));
        assertFalse(UserHandler.areValidCredentials(user, "wronguser", "password", sha1HashCreator));
    }

    @Test
    public void testCreateUserInvalidTypeDefaultsToRegular() {
        User user = UserHandler.createUser("Invalid", "User", "invaliduser", "password123", (byte) 99);
        assertNotNull(user);
        assertTrue(user instanceof RegularUser);
        assertEquals("Invalid", user.getFirstName());
        assertEquals("User", user.getLastName());
        assertEquals("invaliduser", user.getUsername());
        assertEquals("password123", user.getPassword());
        assertEquals(User.TYPE_REGULAR, user.getType());
    }
}
