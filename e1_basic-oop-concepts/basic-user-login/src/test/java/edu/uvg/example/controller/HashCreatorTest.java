package edu.uvg.example.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashCreatorTest {

    @Test
    public void testMD5HashCreator() {
        IHashCreator md5HashCreator = new MD5HashCreator();
        String input = "test";
        String expectedHash = "098f6bcd4621d373cade4e832627b4f6"; // Precomputed MD5 hash for "test"
        String actualHash = md5HashCreator.getHashFromString(input);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    public void testSHA1HashCreator() {
        IHashCreator sha1HashCreator = new SHA1HashCreator();
        String input = "test";
        String expectedHash = "a94a8fe5ccb19ba61c4c0873d391e987982fbbd3"; // Precomputed SHA-1 hash for "test"
        String actualHash = sha1HashCreator.getHashFromString(input);
        assertEquals(expectedHash, actualHash);
    }

    @Test(expected = RuntimeException.class)
    public void testMD5HashCreatorWithNullInput() {
        IHashCreator md5HashCreator = new MD5HashCreator();
        md5HashCreator.getHashFromString(null); // Should throw an exception
    }

    @Test(expected = RuntimeException.class)
    public void testSHA1HashCreatorWithNullInput() {
        IHashCreator sha1HashCreator = new SHA1HashCreator();
        sha1HashCreator.getHashFromString(null); // Should throw an exception
    }
}
