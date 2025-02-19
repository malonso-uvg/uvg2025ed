package edu.uvg;

import java.util.Scanner;

import javax.xml.crypto.KeySelector.Purpose;

public class Cubo extends FiguraGeometrica implements IAreaCalculable, IVolumenCalculable{
    
    public Cubo(){
        lado = 0;
        setType("3D");
    }

    private double lado;

    @Override
    public void getData(Scanner in){
        System.out.println("Calculos de un Cubo");
        System.out.println("Ingrese el valor del lado");
        lado = Double.parseDouble(in.nextLine());    
    }

    @Override
    public double getVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public double getArea() {
        return 6*lado*lado;
    }

    @Override
    public String toString(){
        return "CUBO: El area es: " + getArea() + " El volumen es: " + getVolumen();
    }
    
}
