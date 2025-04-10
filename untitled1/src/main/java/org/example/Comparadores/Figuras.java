package org.example.Comparadores;

import java.util.Date;
import java.util.Objects;

public class Figuras {

    private  String nombre;
    private Double superficie;

    public Figuras(String nombre, Double superficie) {
        this.nombre = nombre;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return "Figuras{" +
                "nombre='" + nombre + '\'' +
                ", superficie=" + superficie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figuras figuras = (Figuras) o;
        return Double.compare(superficie, figuras.superficie) == 0 && Objects.equals(nombre, figuras.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, superficie);
    }



}
