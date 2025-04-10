package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> coches = new ArrayList<>(Arrays.asList("Ford", "Audi", "Skoda", "Citroen","Mitsubushi"));

        Stream<String> streamito = Stream.of("Ford", "Citroen");

        List<String> filtrados = coches.stream()
                .filter(marca -> marca.endsWith("i"))
                .filter(marca -> marca.length()>5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        coches.stream()
                .filter(marca -> marca.endsWith("i"))
                .filter(marca -> marca.length()>5)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        long num = coches.stream()
                .filter(marca -> marca.endsWith("i"))
                .filter(marca -> marca.length()>5)
                .map(String::toUpperCase)
                .count();


        System.out.println(num);

    }

}
