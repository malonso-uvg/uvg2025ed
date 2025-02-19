package edu.uvg;

public class FiguraGeometricaFactory {
    
    public static FiguraGeometrica getInstance(String opt){
        switch (opt) {
            case "1":
                return new Cuadrado();
            case "2":
                return new Cubo();

            case "3":
                return new Circulo();

            case "4":
                return new Esfera();
        
            default:
                return null;
        }
    }
}
