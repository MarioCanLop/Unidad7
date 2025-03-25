package org.example.conjunto_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pruebas {

    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();

        conjunto.add("Agost FC");
        conjunto.add("Monnegre");
        conjunto.add("Maristas");
        conjunto.add("Socarrats FC");
        conjunto.add("Gimnastic de San Vicente");
        conjunto.add("Novelda FC");

        System.out.println(conjunto);

        Set<Integer> conjunto_adds = new LinkedHashSet<>();

        conjunto_adds.add(10);
        conjunto_adds.add(5);
        conjunto_adds.add(8);
        conjunto_adds.add(34);
        conjunto_adds.add(8);
        conjunto_adds.remove(34);


        System.out.println(conjunto_adds);


        Set<String> conjunto_order = new TreeSet<>();

        conjunto_order.add("Solan de cabras");
        conjunto_order.add("Font Vella");
        conjunto_order.add("Bezoya");
        conjunto_order.add("Lanjaron");
        conjunto_order.add("Bezoya");
        conjunto_order.remove("Bezoya");
        conjunto_order.add("font vella");

        System.out.println(conjunto_order);

    }
}