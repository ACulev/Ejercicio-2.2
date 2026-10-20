package com.mycompany.figura;

import java.util.Locale;

public class TrianguloRect extends FiguraRecta {
    
    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(
                ancho * ancho + alto * alto
        );

        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura()
                + "\nSe imprime un Triangulo con alto: "
                + alto + ", ancho: " + ancho
                + String.format(
                        Locale.US,
                        ", area: %.2f, perimetro: %.2f",
                        calcularArea(),
                        calcularPerimetro()
                );
    }
}
