package com.mycompany.figura;

import java.util.Locale;

public class Circulo extends FiguraCircular {
    
    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura()
                + "\nSe imprime un Circulo con radio: "
                + radio
                + String.format(
                        Locale.US,
                        ", area: %.2f, perimetro: %.2f",
                        calcularArea(),
                        calcularPerimetro()
                );
    }
}
