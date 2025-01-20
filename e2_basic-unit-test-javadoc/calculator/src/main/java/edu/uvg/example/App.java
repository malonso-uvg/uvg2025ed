package edu.uvg.example;

import java.io.Console;
import java.util.Scanner;

import edu.uvg.example.model.CalculadoraNormal;
import edu.uvg.example.model.CalculadoraSumas;
import edu.uvg.example.view.CalculadoraConsoleUI;
import edu.uvg.example.view.CalculadoraWindowUI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Seleccione el tipo de interfaz a utilizar");
		System.out.println("1. Console UI");
		System.out.println("2. Aplicaciones de ventanas");
		
		Scanner in = new Scanner(System.in);
		String opt = in.nextLine();
		
		switch(opt) {
		
		case "1": {
			CalculadoraConsoleUI consoleUI = new CalculadoraConsoleUI(in, new CalculadoraSumas());
			//CalculadoraConsoleUI consoleUI = new CalculadoraConsoleUI(in, new CalculadoraNormal());
			consoleUI.MenuPrincipal();
		} break;
		
		case "2": {
			CalculadoraWindowUI windowUI = new CalculadoraWindowUI();
		} break;
		
		default:{
			System.out.println("Opción no válida");
		} break;
		
		}
		
    }
}
