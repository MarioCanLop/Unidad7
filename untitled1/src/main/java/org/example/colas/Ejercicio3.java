package org.example.colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();

        cola.offer("Noche para adultos - Ñengo Flow");
        cola.offer("777 - Roa");
        cola.offer("Guisepe - Luar");
        cola.offer("Babayaga - Clarent");
        cola.offer("Diabla - Hades66");

        System.out.println("Esto inicial de la playlist "+ cola);

        while (!cola.isEmpty()){
            System.out.println("Reporduciendo: " +cola.poll());
            System.out.println("Estado de la playlist después de procesar el trabajo: " + cola);
        }


        if (cola.isEmpty()) {
            System.out.println("La play list a terminado");
        }


    }

}
