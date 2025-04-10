package org.example.Inmutabilidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arbitros {

    List<String> lista = new ArrayList<>(Arrays.asList("Gil Manzano", "Negreira", "Clos Gomez"));

    public List<String> getLista (){

        return Collections.unmodifiableList(lista);

    }

    @Override
    public String
    toString() {
        return "Arbitros{" +
                "lista=" + lista +
                '}';
    }
}
