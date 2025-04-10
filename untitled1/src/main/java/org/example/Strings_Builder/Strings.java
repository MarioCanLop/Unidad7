package org.example.Strings_Builder;

public class Strings {


    public static void main(String[] args) {


        StringBuilder texto = new StringBuilder("Hola ");

        texto.append("Mundo ");

        texto.append("soy Mario ");

        texto.insert(0,"He nacido, ");

        texto.replace(26, 31,"Pepe");

        texto.delete(16,22);

        texto.reverse();

        System.out.println(texto);


    }

}
