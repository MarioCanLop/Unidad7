package org.example.lambas;

import java.util.*;

public class Ordenaciones {

    public static void main(String[] args) {
        List<String> listaCiudades = new ArrayList<>(Arrays.asList("Alicantes", "Madrid", "Barcelona", "Albacete", "Badajoz"));

        //Collections.sort(listaCiudades, (a,b) -> a.compareTo(b));

        listaCiudades.sort(Comparator.comparing(s -> s));

        System.out.println(listaCiudades);

        Profesor patri = new Profesor("Patri", "Programacion", 30);
        Profesor paco =  new Profesor("Paco", "Sistemas informaticso", 45);

        List<Profesor> listaProfes = new ArrayList<>(Arrays.asList(patri,paco));

        listaProfes.sort(Comparator.comparing(Profesor ::getNombre).thenComparing(Profesor::getEdad));

        System.out.println(listaProfes);



    }


}
