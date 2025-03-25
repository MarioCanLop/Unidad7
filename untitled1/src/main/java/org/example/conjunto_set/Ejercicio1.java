package org.example.conjunto_set;

import java.util.*;

public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> palabras = new HashSet<>();


        System.out.println("Introduce una frase");
        String frase = entrada.nextLine();

        String frase_sep [] = frase.split(" ") ;

        for (int i = 0 ; i<frase_sep.length; i++){

        }

        System.out.println("Palabras unicas: " + palabras);
    }
}