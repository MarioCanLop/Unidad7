package org.example.Ejercicio2;

public class Persona {

    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }
}
