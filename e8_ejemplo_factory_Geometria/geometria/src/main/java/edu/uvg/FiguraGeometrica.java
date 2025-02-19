package edu.uvg;

import java.util.Scanner;

public abstract class FiguraGeometrica {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getData(Scanner in){};

}
