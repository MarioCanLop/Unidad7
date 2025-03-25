package org.example;

import java.util.ArrayList;
import java.util.Stack;


public class Main {


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
        System.out.println(pila.peek());
        System.out.println(pila.pop());
    }
}