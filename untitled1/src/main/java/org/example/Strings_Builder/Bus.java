package org.example.Strings_Builder;

import java.util.Random;

public class Bus {
    public static final int TAM = 97;
    static Random aleatorio = new Random();

    public static void main(String[] args) throws InterruptedException {
        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚSç
        int b = 0;
        System.out.println("\n<<<<<<<<<< CARRERA DE BUSES >>>>>>>>>>");
        System.out.println("    MARC MÁRQUEZ vs PECCO BAGNAIA");
        System.out.println("                Fight!!!");
        Thread.sleep(3000);
        while (a < TAM | b < TAM) {

            int turno = aleatorio.nextInt(2)+1;

            a++; // avanzamos
            limpiarPantalla();
            if (a<TAM) {
                System.out.println(dibujarCarrera(a));
                Thread.sleep(70);
            }
        }
        System.out.println("\033[32m"+ "EL AUTOBUSITO HA LLEGADO A SU DESTINO!!" +
                "\033[0m");


    }

    public static String dibujarCarrera(int n1) {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________ ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("| IES MUTXAMEL |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________ ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("| IES SanVicente |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));
        return sb.toString();
    }
    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }


}
