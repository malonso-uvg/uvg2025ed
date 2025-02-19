package edu.uvg;

import java.util.HashMap;

import java.util.HashMap;

public class BankDatabase {
    private static BankDatabase _theOnlyDatabase = null;
    private HashMap<String, Double> accounts;

    private BankDatabase() {
        accounts = new HashMap<>();
        accounts.put("1234", 2000.00);
        accounts.put("5678", 3000.00);
        accounts.put("3456", 200.00);
    }

    public static BankDatabase getInstance() {
        if (_theOnlyDatabase == null) {
            _theOnlyDatabase = new BankDatabase();
        }
        return _theOnlyDatabase;
    }

    public boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }

    public double getBalance(String accountNumber) {
        return accounts.getOrDefault(accountNumber, 0.0);
    }

    public void deposit(String accountNumber, double amount) {
        if (accountExists(accountNumber) && amount > 0) {
            accounts.put(accountNumber, accounts.get(accountNumber) + amount);
        }
    }

    public boolean withdraw(String accountNumber, double amount) {
        if (accountExists(accountNumber) && amount > 0 && accounts.get(accountNumber) >= amount) {
            accounts.put(accountNumber, accounts.get(accountNumber) - amount);
            return true;
        }
        return false;
    }
}
