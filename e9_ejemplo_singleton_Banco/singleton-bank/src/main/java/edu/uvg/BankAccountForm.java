package edu.uvg;

import javax.swing.*;
import java.awt.*;


public class BankAccountForm extends JFrame {
    private String accountNumber;
    private JLabel lblBalance;
    private JTextField txtAmount;
    private JButton btnDeposit, btnWithdraw;
    private BankDatabase bankDatabase;

    public BankAccountForm(String accountNumber) {
        this.accountNumber = accountNumber;
        this.bankDatabase = BankDatabase.getInstance(); // Obtener la base de datos Singleton

        setTitle("Cuenta Bancaria - " + accountNumber);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));

        lblBalance = new JLabel("Saldo: Q" + getBalance(), SwingConstants.CENTER);
        txtAmount = new JTextField();

        btnDeposit = new JButton("Ingresar Dinero");
        btnWithdraw = new JButton("Retirar Dinero");

        btnDeposit.addActionListener(e -> deposit());
        btnWithdraw.addActionListener(e -> withdraw());

        add(lblBalance);
        add(txtAmount);
        add(btnDeposit);
        add(btnWithdraw);
    }

    private double getBalance() {
        return bankDatabase.getBalance(accountNumber);
    }

    private void deposit() {
        try {
            double amount = Double.parseDouble(txtAmount.getText());
            if (amount > 0) {
                bankDatabase.deposit(accountNumber, amount);
                updateBalanceLabel();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void withdraw() {
        try {
            double amount = Double.parseDouble(txtAmount.getText());
            if (amount > 0) {
                if (bankDatabase.withdraw(accountNumber, amount)) {
                    updateBalanceLabel();
                } else {
                    JOptionPane.showMessageDialog(this, "Fondos insuficientes.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateBalanceLabel() {
        lblBalance.setText("Saldo: Q" + getBalance());
        txtAmount.setText(""); // Limpiar campo de entrada
    }

    
}
