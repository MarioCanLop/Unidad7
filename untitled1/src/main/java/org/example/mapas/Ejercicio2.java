package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una palbra...");
        String palabra = entrada.nextLine();


        Map<Character, Integer> mapaLetras = new HashMap<>();

        for (Character letra : palabra.toCharArray()) {
            if (mapaLetras.containsKey(letra)) {
                mapaLetras.put(letra, mapaLetras.getOrDefault(letra, 0) + 1);
            }else {
               mapaLetras.put(letra,1) ;
            }
            // mapaPalabras.put(palabra,mapaPalabras.get(palabra)+1);
            //mapaLetras.put(letra, mapaLetras.getOrDefault(letra, 0) + 1);
        }

        for (Map.Entry<Character, Integer> caracter : mapaLetras.entrySet()) {
            System.out.println(caracter.getKey() + ":" + caracter.getValue());
        }
    }
}
