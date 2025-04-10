package org.example.Inmutabilidad;

public class Pruebas {

    public static void main(String[] args) {

        Arbitros arbitro_comprado = new Arbitros();

        arbitro_comprado.getLista().add("Pito Ragalado");


        System.out.println(arbitro_comprado);

    }

}
