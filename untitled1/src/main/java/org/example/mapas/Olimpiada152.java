package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class Olimpiada152 {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {

        int num = in.nextInt();

        if (num == 0)
        return false;
        else {

            String numeros = in.nextLine();

            String [] numeros_vector = numeros.split(" ");

            Map<String, Integer> mapa= new HashMap<>();

            for ( String k_numero: numeros_vector){

                if (mapa.containsKey(k_numero)){
                    mapa.put(k_numero,mapa.get(k_numero)+1);
                }else {
                    mapa.put(k_numero, 1);
                }



            }
            Integer max = 0;
            String clave_max = "0";
            for (Map.Entry<String, Integer> mapita : mapa.entrySet()){

                if (mapita.getValue()>max){
                    max = mapita.getValue();
                    clave_max = mapita.getKey();
                }

            }

            System.out.println(clave_max);

            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}
