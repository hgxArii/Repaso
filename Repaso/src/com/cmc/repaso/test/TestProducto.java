package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

    public static void main(String[] args) {

        Producto producto = new Producto("Laptop", -1000);

        System.out.println("Nombre: " +
                producto.getNombre());

        System.out.println("Precio original: " +
                producto.getPrecio());

        producto.setPrecio(-1500);

        System.out.println("Nuevo precio: " +
                producto.getPrecio());

        double precioPromo =
                producto.calcularPrecioPromo(20);

        System.out.println("Precio con descuento: " +
                precioPromo);
    }
}
