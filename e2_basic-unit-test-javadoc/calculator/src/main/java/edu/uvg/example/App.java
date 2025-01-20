package edu.uvg.example;

import java.io.Console;
import java.util.Scanner;

import edu.uvg.example.model.CalculadoraNormal;
import edu.uvg.example.model.CalculadoraSumas;
import edu.uvg.example.model.ICalculator;
import edu.uvg.example.view.CalculadoraConsoleUI;
import edu.uvg.example.view.CalculadoraWindowUI;
import edu.uvg.example.view.IUserInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		IUserInterface miInterfazGrafica = null;

        System.out.println("Seleccione el tipo de interfaz a utilizar");
		System.out.println("1. Console UI");
		System.out.println("2. Aplicaciones de ventanas");
		
		Scanner in = new Scanner(System.in);
		String opt = in.nextLine();
		
		switch(opt) {
		
		case "1": {
			miInterfazGrafica = new CalculadoraConsoleUI(in);
		} break;
		
		case "2": {
			miInterfazGrafica = new CalculadoraWindowUI();
		} break;

		default:{
			System.out.println("Opción no válida");
		} break;
		
		}

		opt = "";

		System.out.println("Seleccione el tipo de Calculadora a utilizar");
		System.out.println("1. Normal");
		System.out.println("2. Basada en sumas");

		opt = in.nextLine();

		switch (opt) {
			case "1":
					miInterfazGrafica.ShowGUI(new CalculadoraNormal());
				break;

				case "2":
					miInterfazGrafica.ShowGUI(new CalculadoraSumas());
				break;
		
			default:
				System.out.println("Opcion no valida");
				break;
		}
		
    }
}
