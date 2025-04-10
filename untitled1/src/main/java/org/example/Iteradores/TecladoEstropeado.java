package org.example.Iteradores;

import java.util.LinkedList;
import java.util.ListIterator;

public class TecladoEstropeado {

    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {
        if (!entrada.hasNext())
            return false;
        else {
                String texto = entrada.nextLine();

            LinkedList<Character> letritras = new LinkedList<>();
            ListIterator<Character> it = letritras.listIterator();

            for (char c : texto.toCharArray()){

                switch (c){
                    case '-':
                        while (it.hasPrevious()){
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                        break;
                }

            }

            for (char c : letritras){

                System.out.print(c);

            }

            return true;
        }
    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}
