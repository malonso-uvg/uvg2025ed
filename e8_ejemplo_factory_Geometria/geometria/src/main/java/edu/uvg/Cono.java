package edu.uvg;

import java.util.Scanner;

public class Cono extends FiguraGeometrica implements IAreaCalculable, IVolumenCalculable{
    
    private double radioBase;
    private double altura;

    public Cono(){
        radioBase = 0;
        altura = 0;
        setType("3D");
    }

    @Override
    public void getData(Scanner in){
        System.out.println("Calculos de un Cono");
        System.out.println("Ingrese el valor del radio de la base");
        radioBase = Double.parseDouble(in.nextLine());
        System.out.println("Ingrese el valor de la altura");
        altura = Double.parseDouble(in.nextLine());
    }

    @Override
    public double getVolumen() {
        return (1/3)*Math.PI*Math.pow(radioBase, 2)*altura;
    }

    @Override
    public double getArea() {
        double ladoCongruente = Math.sqrt( Math.pow(radioBase, 2) + Math.pow(altura, 2) );
        return Math.PI * radioBase * (radioBase + ladoCongruente);
    }

    @Override
    public String toString(){
        return "CONO: El area es: " + getArea() + " El volumen es: " + getVolumen();
    }
    

}
