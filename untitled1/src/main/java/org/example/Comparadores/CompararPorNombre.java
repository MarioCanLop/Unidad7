package org.example.Comparadores;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Figuras> {


    @Override
    public int compare(Figuras o1, Figuras o2) {
        int resultadoCompararNombre = o1.getNombre().compareTo(o2.getNombre());

        if (resultadoCompararNombre!=0){
            return resultadoCompararNombre;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
