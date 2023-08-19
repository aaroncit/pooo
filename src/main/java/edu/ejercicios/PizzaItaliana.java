package edu.ejercicios;

import java.util.List;

public class PizzaItaliana extends Pizza {
    private String salsa;
    private int tiempoEnHorno;

    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo salsa " + salsa + " durante la preparación.");
        System.out.println("Tiempo en horno: " + tiempoEnHorno + " minutos.");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno + " minutos";
    }
}
