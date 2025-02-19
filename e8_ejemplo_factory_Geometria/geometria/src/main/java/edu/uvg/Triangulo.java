package edu.uvg;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica implements IPerimetroCalculable, IAreaCalculable{
    
    private double base;
    private double altura;

    public Triangulo(){
        base = 0;
        altura = 0;
        setType("2D");
    }

    @Override
    public void getData(Scanner in){
        System.out.println("Calculos de un Triangulo");
        System.out.println("Ingrese el valor de la base");
        base = Double.parseDouble(in.nextLine());
        System.out.println("Ingrese el valor de la altura");
        altura = Double.parseDouble(in.nextLine());
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        //Calculo del lado congruente
        double ladoCongruente = Math.sqrt( Math.pow((base / 2), 2) + Math.pow(altura, 2) );
        return 2*ladoCongruente + base;
    }

    @Override
    public String toString(){
        return "TRIANGULO ISOSCELES: El area es: " + getArea() + " El perimetro es: " + getPerimetro();
    }
}
