package org.example.equals_hascode;

import java.util.Objects;

public class Equipos {

    private String nombre_equipos;
    private int numero;


    public Equipos(String nombre_equipos, int numero) {
        this.nombre_equipos = nombre_equipos;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "nombre_equipos='" + nombre_equipos + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return numero == equipos.numero && Objects.equals(nombre_equipos, equipos.nombre_equipos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_equipos);
    }
}
