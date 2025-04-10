package org.example.Comparadores;

import java.util.*;

public class Mapitas {

    public static void main(String[] args) {

        HashMap<String, Double> cubatas = new HashMap<>();
        cubatas.put("Bichinau", 7.00);
        cubatas.put("Ron cola", 8.00);
        cubatas.put("Gintonic", 10.5);


        List<Map.Entry<String, Double>> listaMapita = new ArrayList<>(cubatas.entrySet());

        listaMapita.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Double> mapita : listaMapita){

            System.out.println("Cubalitres " + mapita.getKey() + " con precio:" + mapita.getValue());

        }


    }

}
