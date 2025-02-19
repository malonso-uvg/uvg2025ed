package edu.uvg;

import java.util.Scanner;

public class Circulo extends FiguraGeometrica implements IPerimetroCalculable, IAreaCalculable{
    
    public Circulo(){
        radio = 0;
        setType("2D");
    }

    private double radio;

    @Override
    public void getData(Scanner in){
        System.out.println("Calculos de un Circulo");
        System.out.println("Ingrese el valor del radio");
        radio = Double.parseDouble(in.nextLine());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 4 * Math.PI * radio;
    }

    @Override
    public String toString(){
        return "CIRCULO: El area es: " + getArea() + " El perimetro es: " + getPerimetro();
    }
    
}
