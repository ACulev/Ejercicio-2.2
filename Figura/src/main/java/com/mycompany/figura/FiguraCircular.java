package com.mycompany.figura;

public class FiguraCircular extends Figura2D {
    
    protected int radio;

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
