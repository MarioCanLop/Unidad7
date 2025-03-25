package org.example.colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1 {

    public static void main(String[] args) {

        Queue<Character> cola = new LinkedList<>();

        cola.offer('a');
        cola.offer('b');
        cola.offer('c');
        cola.offer('d');
        cola.offer('e');

        if (cola.isEmpty()){
            System.out.println("La cola esta vacia");
        }

        System.out.println(cola.size());
        System.out.println(cola.peek());
        System.out.println();
        while (!cola.isEmpty()){
            System.out.println(cola.poll());
        }
    }

}
