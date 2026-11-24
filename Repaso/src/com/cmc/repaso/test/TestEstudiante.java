package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Carlos");

        estudiante.calificar(9.5);

        System.out.println("Nombre: " +
                estudiante.getNombre());

        System.out.println("Nota: " +
                estudiante.getNota());

        System.out.println("Resultado: " +
                estudiante.getResultado());

        System.out.println("------------------");

        Estudiante estudiante2 = new Estudiante("Maria");

        estudiante2.calificar(7);

        System.out.println("Nombre: " +
                estudiante2.getNombre());

        System.out.println("Nota: " +
                estudiante2.getNota());

        System.out.println("Resultado: " +
                estudiante2.getResultado());
    }
}
