package org.example.mapas.PracticaDiccionario;

public class AppDiccionario {

    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();

        diccionario.insertar("Hola", "Hello");
        diccionario.insertar("Mundo", "World");
        diccionario.insertar("Casa", "House");
        diccionario.insertar("Perro", "Dog");
        diccionario.insertar("Gato", "Cat");
        diccionario.insertar("Coche", "Car");

        diccionario.primeraLetraTraducción("Hola");

    }

}
