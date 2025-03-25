package org.example.colas;

import java.lang.invoke.CallSite;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;



public class Ejercicio4 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String eleccion = "";
        Deque<String> lista = new LinkedList<>();
        do {


            System.out.println("---Lista de la compra");
            System.out.println("1.Añadir producto al final");
            System.out.println("2.Eliminar primer producto");
            System.out.println("3.Eliminar producto por nombre");
            System.out.println("4.Ver primer producto");
            System.out.println("5.Buscar producto");
            System.out.println("6.Mostrar lista actual");
            System.out.println("X.Salir");
            System.out.println("Seleccione una opcion");
            eleccion = entrada.next();

            switch (eleccion) {
                case "1":
                    System.out.println("Prodcuto a añadir");
                    lista.offerLast(entrada.next());
                    break;
                case "2":
                    System.out.println("Producto eliminado: " + lista.pollFirst());
                    break;
                case "3":
                    System.out.println("Producto para eliminar");
                    String producto = entrada.next();
                    if (lista.contains(producto)) {
                        System.out.println("Eliminando producto: " + lista.remove(producto));
                    } else {
                        System.out.println("El producto no esta en la lista");
                    }
                    break;
                case "4":
                    System.out.println("Primer producto " + lista.peekFirst());
                    break;
                case "5":
                    System.out.println("Producto a buscar");
                    String producto2 = entrada.next();
                    if (lista.contains(producto2)) {
                        System.out.println("Esta en la lista");
                    } else {
                        System.out.println("No esta en la lista");
                    }
                    break;
                case "6":
                    System.out.println(lista);
                    break;
                default:
                    break;

            }
        }while (!eleccion.equals("X"));


    }




}
