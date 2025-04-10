package org.example.lambas;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto( "Smarthphone", 150.0, "Electronica"));
        listaProductos.add(new Producto( "Tablet", 72.00, "Electronica"));
        listaProductos.add(new Producto( "Perfume árabe", 40.0, "Permufes"));
        listaProductos.add(new Producto( "Kebab", 3.50, "Comida"));


        List<Producto> productosFiltrados = new ArrayList<>();
        FiltroProducto filtro = (producto) -> {

            if (producto.getCategoria().equals("Electronica") && producto.getPrecio()>100){

                return true;


            }

            return false;
        };

        for (Producto producto : listaProductos){

            if (filtro.filtrar(producto)){
                productosFiltrados.add(producto);
            }

        }
        System.out.println("Prodductos despues de filtrar: ");
        for (Producto producto : productosFiltrados){

            System.out.println(producto);

        }



    }

}
