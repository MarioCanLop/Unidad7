package org.example.conjunto_set;

import java.util.*;

public class Ejercicio3 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> webs = new LinkedHashSet<>();

        do {
            System.out.println("Escribe una URL visitada (o 'salir' para terminar): ");
            String si = entrada.next();
            if (si.equals("salir")){
                break;
            }else {
                webs.add(si);
            }
        }while (true);

        System.out.println("Historial de Navegación: ");
        for (String web : webs){
            System.out.println("-" + web);
        }


    }
}
