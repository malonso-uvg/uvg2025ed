package edu.uvg.example.view;

import javax.swing.*;

import edu.uvg.example.model.CalculadoraNormal;
import edu.uvg.example.model.CalculadoraSumas;
import edu.uvg.example.model.ICalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraWindowUI extends JFrame implements IUserInterface{

    private JTextField numberField1;
    private JTextField numberField2;
    private JComboBox<String> operationsDropdown;
    private JButton executeButton;
    private JLabel resultLabel;
    private ICalculator calculadoraInterna;

    public CalculadoraWindowUI() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes
        JLabel label1 = new JLabel("Número 1:");
        numberField1 = new JTextField();

        JLabel label2 = new JLabel("Número 2:");
        numberField2 = new JTextField();

        JLabel operationLabel = new JLabel("Operación:");
        String[] operations = {"Suma", "Resta", "Multiplicación", "División", "Módulo"};
        operationsDropdown = new JComboBox<>(operations);

        executeButton = new JButton("Ejecutar");
        resultLabel = new JLabel("Resultado: ", JLabel.CENTER);

        // Añadir componentes al JFrame
        add(label1);
        add(numberField1);

        add(label2);
        add(numberField2);

        add(operationLabel);
        add(operationsDropdown);

        add(new JLabel()); // Espacio vacío
        add(executeButton);

        add(new JLabel()); // Espacio vacío
        add(resultLabel);

        // Acción del botón
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });

    }

    private void calculateResult() {
        try {
            int num1 = Integer.parseInt(numberField1.getText());
            int num2 = Integer.parseInt(numberField2.getText());
            String operation = (String) operationsDropdown.getSelectedItem();
            int result = 0;

            switch (operation) {
                case "Suma":
                    result = calculadoraInterna.add(num1, num2);
                    break;
                case "Resta":
                    result = calculadoraInterna.subs(num1, num2);
                    break;
                case "Multiplicación":
                    result = calculadoraInterna.mult(num1, num2);
                    break;
                case "División":
                    if (num2 == 0) {
                        resultLabel.setText("Error: División por cero");
                        return;
                    }
                    result = calculadoraInterna.div(num1, num2);
                    break;
                case "Módulo":
                    if (num2 == 0) {
                        resultLabel.setText("Error: División por cero");
                        return;
                    }
                    result = calculadoraInterna.mod(num1, num2);
                    break;
                default:
                    resultLabel.setText("Operación no válida");
                    return;
            }

            resultLabel.setText("Resultado: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Error: Entrada no válida");
        }
    }

    @Override
    public void ShowGUI(ICalculator calculator) {

        calculadoraInterna = calculator;
        setVisible(true);
        
    }
}
