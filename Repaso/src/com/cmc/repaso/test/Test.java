package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class Test {

    public static void main(String[] args) {

        Item producto1 = new Item("Laptop");

        producto1.setProductosActuales(20);

        System.out.println("ESTADO INICIAL");
        producto1.imprimir();

        System.out.println("--------------------");

        producto1.vender(5);

        System.out.println("DESPUES DE VENDER");
        producto1.imprimir();

        System.out.println("--------------------");

        producto1.devolver(2);

        System.out.println("DESPUES DE DEVOLVER");
        producto1.imprimir();

        System.out.println("====================");

        Item producto2 = new Item("Mouse");

        producto2.setProductosActuales(20);

        System.out.println("SEGUNDO PRODUCTO");
        producto2.imprimir();

        producto2.vender(10);

        System.out.println("DESPUES DE VENDER");
        producto2.imprimir();

        producto2.devolver(3);

        System.out.println("DESPUES DE DEVOLVER");
        producto2.imprimir();
    }
}
