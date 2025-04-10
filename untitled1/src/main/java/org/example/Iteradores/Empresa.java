package org.example.Iteradores;

public class Empresa {

    private String nombre;
    private  int empleados;

    public Empresa(String nombre, int empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
