package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {

    public static void main(String[] args) {


        HashMap<String, Integer> mapanotas = new HashMap<>();

        mapanotas.put("Ismael", 3);
        mapanotas.put("David", 4);
        mapanotas.put("Antonio", 1);
        mapanotas.put("Cesar", 5);

        System.out.println(mapanotas);

        mapanotas.put("Ismael", 6);

        System.out.println("Nota de Ismael"+mapanotas.get("Ismael"));

        mapanotas.remove("Antonio");
        System.out.println(mapanotas);

        if (mapanotas.containsKey("Cesar")){
            System.out.println("Cesar exisiste");
        }

        if (mapanotas.containsValue(10)){
            System.out.println("Alguien tiene un 10");
        }

        System.out.println(mapanotas.keySet());//claves
        System.out.println(mapanotas.values());//valores del mapa aislados


        for (String claves : mapanotas.keySet()){
            System.out.println("Clave: " + claves);
        }

        for (Integer notas : mapanotas.values()){
            System.out.println("Notas: "+ notas);
        }

        for (Map.Entry<String, Integer> mapa : mapanotas.entrySet()){

            System.out.println("Alumno "+ mapa.getKey() + " con nota "+ mapa.getValue());



        }


    }

}
