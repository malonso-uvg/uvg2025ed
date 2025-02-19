package edu.uvg;

import java.util.Scanner;

public class Cuadrado extends FiguraGeometrica implements IPerimetroCalculable, IAreaCalculable{
    
    public Cuadrado(){
        lado = 0;
        setType("2D");
    }

    private double lado;

    @Override
    public void getData(Scanner in){
        System.out.println("Calculos de un cuadrado");
        System.out.println("Ingrese el valor del lado");
        lado = Double.parseDouble(in.nextLine());
    }

    @Override
    public double getArea() {
        return lado * lado;    
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString(){
        return "CUADRADO: El area es: " + getArea() + " El perimetro es: " + getPerimetro();
    }
    
}
