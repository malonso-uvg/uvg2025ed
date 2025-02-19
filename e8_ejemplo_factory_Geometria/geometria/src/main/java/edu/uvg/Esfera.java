package edu.uvg;

import java.util.Scanner;

public class Esfera extends FiguraGeometrica implements IAreaCalculable, IVolumenCalculable{
    
    public Esfera(){
        radio = 0;
        setType("3D");
    }

    private double radio;
    @Override
    public void getData(Scanner in){
        System.out.println("Calculos de una Esfera");
        System.out.println("Ingrese el valor del radio");
        radio = Double.parseDouble(in.nextLine());    
    }

    @Override
    public double getVolumen() {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }
    @Override
    public double getArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public String toString(){
        return "ESFERA: El area es: " + getArea() + " El volumen es: " + getVolumen();
    }
    
}
