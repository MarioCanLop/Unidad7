package org.example.lambas;

import java.util.Scanner;

public class Pruebas {


    public static void main(String[] args) {

        //Ejercicio 1
        Profesores patri = new Profesores() {
            @Override
            public Boolean calificar(int nota) {

                System.out.println("Comparando para: " + nota);
                if (nota>10){
                    return true;
                }else {
                    return false;
                }

            }
        };


        Boolean notas_patri = patri.calificar(7);
        System.out.println(notas_patri);


        Profesores paco = (nota) -> {

            System.out.println("Comparando para: " + nota);
            if (nota>10){
                return true;
            }else {
                return false;
            }
        };

        Boolean notas_paco = patri.calificar(15);
        System.out.println(notas_paco);

        //Ejercicio 2

//        VerificarVoto verificar = new VerificarVoto() {
//            @Override
//            public boolean puedeVotar(String nombre, int edad) {
//                System.out.println("Probando " + nombre + " con " + edad + " años...");
//                if (edad<18){
//                    return false;
//                }else {
//                    return true;
//                }
//            }
//        };
//
//        Profesor Juan = new Profesor("Juan", "Programación", 26);
//        Profesor Mario = new Profesor("Mario", "Programación", 26);
//
//        Boolean salida = verificar.puedeVotar(Juan);
//        System.out.println(salida);
//
//        Boolean salida2 = verificar.puedeVotar(Mario);
//        System.out.println(salida2);


        //Ejercicio 3






    }

}
