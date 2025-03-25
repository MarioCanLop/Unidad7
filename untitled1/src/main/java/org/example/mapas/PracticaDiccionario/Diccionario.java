package org.example.mapas.PracticaDiccionario;

import java.util.*;

public class Diccionario {

    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();
    private Map<String, String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void insertar (String espanyol, String ingles){

        diccionario.put(espanyol, ingles);

    }

    public void traducir (){

        System.out.println("Que palabra quieres traducir");
        String palabra = entrada.next();

        if (!diccionario.containsKey(palabra)){
            System.out.println("Esta palabra no esta registrada");
        }else{
            System.out.println("La traduccion de la palabra " + palabra + " es "+ diccionario.get(palabra));
        }

    }

    public void palabraAleatoria(){

        //keySett()
        List<String> palabras = new ArrayList<>(diccionario.keySet());

        String palabraRandom = palabras.get(aleatorio.nextInt(palabras.size()));

        System.out.println(palabraRandom + " = " + diccionario.get(palabraRandom));

    }

    public void primeraLetraTraducción(String palabra_es){

        int bien = 0;
        int mal = 0;
        int preguntas = 0;

        if (!diccionario.containsKey(palabra_es)){
            System.out.println("La palbra no esta en el diccionario");
        }else {
            do {

                System.out.println(palabra_es + ": " + diccionario.get(palabra_es).charAt(0));
                System.out.println("Indique la respuesta: ");
                String respuesta = entrada.next();
                if (respuesta.equals("fin")) {
                    System.out.println("FIN DEL PROGRAMA");
                    System.out.println("Preguntas Realizadas " + preguntas);
                    System.out.println("Preguntas Acertadas "+ bien);
                    System.out.println("Preguntas Falladas "+ mal);
                    System.exit(0);
                } else {

                    if (diccionario.get(palabra_es).equals(respuesta)) {
                        System.out.println("¡CORRECTO!");
                        bien++;
                        preguntas++;
                    } else {
                        System.out.println("¡NO! La respuesta correcta es " + diccionario.get(palabra_es));
                        mal++;
                        preguntas++;
                    }
                }
                palabra_es = intermediario();
            }while (true);
        }

    }

    public String intermediario(){

        List<String> palabras = new ArrayList<>(diccionario.keySet());

        return  palabras.get(aleatorio.nextInt(palabras.size()));
    }

}
