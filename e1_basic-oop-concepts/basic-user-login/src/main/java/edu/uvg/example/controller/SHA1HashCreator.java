package edu.uvg.example.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class SHA1HashCreator implements IHashCreator {
    @Override
    public String getHashFromString(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hashBytes = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-1 algorithm not available", e);
        }
    }
}
