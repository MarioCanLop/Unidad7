package org.example.pilas;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {


        Stack<Integer> pila = new Stack<>();
        System.out.println("Introduce el primer numero");
        pila.push(entrada.nextInt());
        System.out.println("Introduce el segundo numero");
        pila.push(entrada.nextInt());
        System.out.println("Introduce el tercer numero");
        pila.push(entrada.nextInt());
        System.out.println("Número de orden inverso");
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
}
