package edu.ejercicios;

import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;
    private List<String> ingredientes;

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public double calcularCostoIngredientes() {
        double costoTotal = 0;
        for (String ingrediente : ingredientes) {
            costoTotal += obtenerPrecioIngrediente(ingrediente);
        }
        return costoTotal;
    }

    public void agregarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        System.out.println("Ingrediente " + ingrediente + " agregado a la pizza " + nombre);
    }

    public void eliminarIngrediente(String ingrediente) {
        ingredientes.remove(ingrediente);
        System.out.println("Ingrediente " + ingrediente + " eliminado de la pizza " + nombre);
    }

    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }

    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }

    public void cambiarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
        System.out.println("El precio de la pizza " + nombre + " ha sido actualizado a " + precio);
    }

    public boolean contieneIngrediente(String ingrediente) {
        return ingredientes.contains(ingrediente);
    }

    public String getNombre() {
        return nombre;
    }

    private double obtenerPrecioIngrediente(String ingrediente) {
        // Lógica para obtener el precio de cada ingrediente (debe implementarse)
        // Retornaremos un valor fijo por simplicidad
        if (ingrediente.equals("Queso")) {
            return 1.5;
        } else if (ingrediente.equals("Tomate")) {
            return 0.75;
        } else if (ingrediente.equals("Cebolla")) {
            return 0.5;
        } else {
            return 0.0; // Ingrediente desconocido o sin precio
        }
    }
}








