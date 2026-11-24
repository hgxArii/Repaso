package com.cmc.repaso.entidades;

public class Item {

    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    public Item(String nombre) {
        this.nombre = nombre;
        this.productosActuales = 0;
        this.productosDevueltos = 0;
        this.productosVendidos = 0;
    }

    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }

    public void imprimir() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Productos actuales: " + productosActuales);
        System.out.println("Productos vendidos: " + productosVendidos);
        System.out.println("Productos devueltos: " + productosDevueltos);
    }

    public void vender(int cantidad) {

        productosActuales = productosActuales - cantidad;

        productosVendidos = productosVendidos + cantidad;
    }

    public void devolver(int cantidad) {

        productosActuales = productosActuales + cantidad;

        productosVendidos = productosVendidos - cantidad;

        productosDevueltos = productosDevueltos + cantidad;
    }
}
