package com.mycompany.figura;

public class FiguraRecta extends Figura2D {
    protected int ancho;
    protected int alto;

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 * (ancho + alto);
    }
    
}
