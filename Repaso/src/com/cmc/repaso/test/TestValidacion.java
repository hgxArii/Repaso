package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

    public static void main(String[] args) {

        Validacion validacion = new Validacion();

        System.out.println("Monto 100: " +
                validacion.validarMonto(100));

        System.out.println("Monto -50: " +
                validacion.validarMonto(-50));

        System.out.println("Monto 0: " +
                validacion.validarMonto(0));
    }
}
