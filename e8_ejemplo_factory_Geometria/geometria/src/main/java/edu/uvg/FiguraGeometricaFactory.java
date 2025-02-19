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

                case "5":
                return new Triangulo();

                case "6":
                return new Cono();
        
            default:
                return null;
        }
    }
}
