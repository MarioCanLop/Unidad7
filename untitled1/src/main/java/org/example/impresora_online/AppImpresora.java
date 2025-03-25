package org.example.impresora_online;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppImpresora {

    private static final String ID_PC  = "PC1234";

    static LinkedHashSet<Petición> colaPeticiones = new LinkedHashSet<>();



    public static void main(String[] args) {

        anyadirDocumento("prueba.pdf");
        anyadirDocumento("prueba.txt");
        anyadirDocumento("expendiente.pdf");
        anyadirDocumento("notas.pdf");
        anyadirDocumento("expendiente.pdf");

        imprimirDocumento();
        System.out.println("Quedan " + getnumPeticiones() + " peticiones en la cola");
        System.out.println(colaPeticiones);
        imprimirTodo();


    }
    public static void anyadirDocumento(String nombre_archivo){

        if (nombre_archivo.endsWith(".pdf")) {
            if(colaPeticiones.add(new Petición(ID_PC, nombre_archivo))){
                System.out.println("El archivo " + nombre_archivo + " añadido a la cola de impresión");
            }else
                System.out.println("El archivo " + nombre_archivo + " ya exisiste en la cola de impresión");

        }else
            System.out.println("El archivo "+ nombre_archivo + "  no tiene el formato correcto");


    }

    public static void  imprimirDocumento(){

        System.out.println("Imprimiendo... " + colaPeticiones.getFirst().getNombre_archivo());
        colaPeticiones.removeFirst();
    }

    public static int getnumPeticiones(){
        return colaPeticiones.size();
    }

    public static void verTodo(){
        System.out.println("Cola impresión: " + colaPeticiones);
    }

    public static void imprimirTodo(){
        while (!colaPeticiones.isEmpty()){
            imprimirDocumento();
        }

        System.out.println("La cola ha finalizado");
    }
}
