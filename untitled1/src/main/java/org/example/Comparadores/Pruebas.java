package org.example.Comparadores;

import java.util.*;

public class Pruebas {

    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(1,5,4,12,20));

        Collections.sort(numeros);
        System.out.println(numeros);

        ArrayList<String> nombres = new  ArrayList<>(Arrays.asList("Patricia", "Ismael", "Mauro", "David", "Juan"));

        Collections.sort(nombres);
        System.out.println(nombres);

        ArrayList<Figuras> figuritas = new ArrayList<Figuras>();

        figuritas.add(new Figuras("Cuadrado", 20.00));
        figuritas.add(new Figuras("Triangulo", 38.00));
        figuritas.add(new Figuras("Octagono", 12.00));
        figuritas.add(new Figuras("Tricontraakaiheptagono", 89.00));


        "2".compareTo("2");

        System.out.println(figuritas);


    }

}
