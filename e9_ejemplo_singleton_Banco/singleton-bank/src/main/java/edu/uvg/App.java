package edu.uvg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame("Seleccionar Cuenta");
            mainFrame.setSize(300, 150);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setLayout(new FlowLayout());

            JTextField txtAccount = new JTextField(10);
            JButton btnOpenAccount = new JButton("Abrir Cuenta");

            btnOpenAccount.addActionListener(e -> {
                String accountNumber = txtAccount.getText();
                if (BankDatabase.getInstance().accountExists(accountNumber)) {
                    new BankAccountForm(accountNumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(mainFrame, "Cuenta no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            });

            mainFrame.add(new JLabel("Número de Cuenta:"));
            mainFrame.add(txtAccount);
            mainFrame.add(btnOpenAccount);
            mainFrame.setVisible(true);
        });
    }

}
