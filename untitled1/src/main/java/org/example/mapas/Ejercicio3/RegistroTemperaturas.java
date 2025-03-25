package org.example.mapas.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {

    static Scanner entrada = new Scanner(System.in);

    private Map <String, Double> mapaTemperaturas;

    public RegistroTemperaturas() {
        mapaTemperaturas = new HashMap<>();
    }

    public void insertar (String ciudad, Double temp){

        mapaTemperaturas.put(ciudad, temp);
        System.out.println("Temperatura de " + temp + " registrados para " + ciudad);

    }

    public void actualizar (String ciudad){

        System.out.println("¿Que temperatura hace en " +ciudad + " ?");
        mapaTemperaturas.put(ciudad, entrada.nextDouble());
        System.out.println("Temperatura actualizada en " + ciudad );


    }

    public void consultar (){

        System.out.println("Que ciudad deseas consultar");
        String ciudad = entrada.next();
        if (!mapaTemperaturas.containsKey(ciudad)){
            System.out.println("No exisisten registros de esta ciudad");
        }else{
            System.out.println("Temperatura en "+ciudad +" : " + mapaTemperaturas.get(ciudad));

        }
    }

    public void verTodas(){

        for (Map.Entry<String, Double> mapita: mapaTemperaturas.entrySet()){
            System.out.println(mapita.getKey() + ": " + mapita.getValue() );
        }

    }

    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }
}
