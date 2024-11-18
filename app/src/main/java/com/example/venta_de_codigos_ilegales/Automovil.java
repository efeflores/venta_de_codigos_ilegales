package com.example.venta_de_codigos_ilegales;

public class Automovil {
    private String nombre;
    private double precio;
    private double recargo;

    public Automovil(String nombre, double precio, double recargo) {
        this.nombre = nombre;
        this.precio = precio;
        this.recargo = recargo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getRecargo() {
        return recargo;
    }

    public double calcularTotal() {
        return precio + recargo;
    }
}
