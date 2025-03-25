package org.example.impresora_online;

import java.util.Objects;

public class Petición {

    private String id ;
    private String nombre_archivo;



    public Petición(String id, String nombre_archivo) {
        this.id = id;
        this.nombre_archivo = nombre_archivo;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    @Override
    public String toString() {
        return "Petición{" +
                "id='" + id + '\'' +
                ", nombre_archivo='" + nombre_archivo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Petición petición = (Petición) o;
        return Objects.equals(id, petición.id) && Objects.equals(nombre_archivo, petición.nombre_archivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre_archivo);
    }
}
