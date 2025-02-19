package edu.uvg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Systema de FIguras Geometricas" );
        ArrayList<FiguraGeometrica> misFiguras = new ArrayList<FiguraGeometrica>();
        Scanner in = new Scanner(System.in);
        String opt = "";
        while (!opt.equalsIgnoreCase("salir")){
            
            System.out.println("Seleccione la figura a crear");
            System.out.println("1. Cuadrado");
            System.out.println("2. Cubo");
            System.out.println("3. Circulo");
            System.out.println("4. Esfera");
            System.out.println("Escriba 'salir' para finalizar el programa");

            opt = in.nextLine();

            FiguraGeometrica figura = FiguraGeometricaFactory.getInstance(opt);

            if (figura != null){
                figura.getData(in);
                misFiguras.add(figura);
            }

        }

        System.out.println("**** LAS FIGURAS GUARDADAS SON ****");
        for (FiguraGeometrica figura: misFiguras){
            System.out.println(figura.toString());
        }
    }
}
