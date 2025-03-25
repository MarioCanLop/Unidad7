package org.example.pilas;

import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {

        Stack<Character> pila = new Stack<>();
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');

        if (pila.isEmpty()) {
            System.out.println("Esta vacia");
        }else {
            System.out.println("No esta vacia");
        }

        System.out.println(pila.size());
        System.out.println();
        System.out.println(pila.peek());
        System.out.println();
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
}
