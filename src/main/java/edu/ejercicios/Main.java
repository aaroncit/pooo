package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingredientesPizza = new ArrayList<>();
        ingredientesPizza.add("Queso");
        ingredientesPizza.add("Tomate");
        ingredientesPizza.add("Cebolla");

        Pizza miPizza = new Pizza("Bombastick", 8.99, ingredientesPizza);
        miPizza.preparar();
        System.out.println(miPizza);

        // Agregar un ingrediente adicional
        miPizza.agregarIngrediente("Jamón");

        // Calcular el costo de los ingredientes
        double costoIngredientes = miPizza.calcularCostoIngredientes();
        System.out.println("El costo total de los ingredientes es: " + costoIngredientes);

        // Cambiar el precio de la pizza
        miPizza.cambiarPrecio(9.99);

        // Verificar si la pizza contiene un ingrediente específico
        if (miPizza.contieneIngrediente("Queso")) {
            System.out.println("La pizza contiene queso.");
        } else {
            System.out.println("La pizza no contiene queso.");
        }

        // Crear una pizza italiana y probar sus funcionalidades
        List<String> ingredientesPizzaItaliana = new ArrayList<>();
        ingredientesPizzaItaliana.add("Queso");
        ingredientesPizzaItaliana.add("Tomate");

        PizzaItaliana miPizzaItaliana = new PizzaItaliana("Pizza Italiana", 10.99, ingredientesPizzaItaliana, "Pomodoro", 15);
        miPizzaItaliana.preparar();
        System.out.println(miPizzaItaliana);
    }
}

