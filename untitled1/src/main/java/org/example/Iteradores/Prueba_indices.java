package org.example.Iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Prueba_indices {

    public static void main(String[] args) {

        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(12,33,1,5,6));

        ListIterator<Integer> it = numeritos.listIterator();

        //sin moverme
        System.out.println(it.nextIndex());
        System.out.println(it.previousIndex());

        //avanzo
        it.next();
        System.out.println(it.nextIndex());
        System.out.println(it.previousIndex());


        it.next();
        it.next();
        it.next();
        it.next();

        System.out.println(it.nextIndex());
        System.out.println(it.previousIndex());





    }

}
