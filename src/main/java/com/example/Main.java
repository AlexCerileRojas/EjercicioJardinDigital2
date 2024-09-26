package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        setUp();
    }

    public static void setUp() {

        String[][] infoPlantas = new String[9][1]; //10 filas y 2 columnas

        menu(infoPlantas);

    }

    public static void menu(String[][] plantas) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        mostrarOpcionesMenu();
        System.out.print("Seleccione una opcion: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 0:
                System.out.print("Ingrese el  nombre de la nueva planta que desea registrar");
                String nombrePlanta = scanner.nextLine();
                registrarPlanta(plantas, nombrePlanta);
                break;

            case 1:
                mostrarPlantas(plantas);
                break;

            case 2:
                System.out.print("Ingrese el nombre de la planta a buscar: ");
                String nombreBuscar = scanner.nextLine();
                buscarPlanta(plantas,nombreBuscar);
                break;

            case 3:


            case 4:
                diaSiguiente(plantas);
        }

        
    }
    public static void mostrarOpcionesMenu() {
        System.out.println("\n--- Menú del Jardín ---");
        System.out.println("0. Registrar una nueva planta");
        System.out.println("1. Mostrar las plantas del jardín");
        System.out.println("2. Buscar una planta en el jardín ");
        System.out.println("3. Regar una planta");
        System.out.println("4. Avanzar un día");
        System.out.println("5. Salir");
    }

    public static void registrarPlanta(String[][] plantas, String nombre) {

        for (int i = 0; i < plantas.length; i++) {
            // que recorre el bucle for?
            if (plantas[i][0] == null) {
                plantas[i][0] = nombre;
                plantas[i][1] = "0";

                break;
            }
        }
    }

    public static void mostrarPlantas(String[][] plantas) {

        for (int i = 0; i < plantas.length; i++) {
            if (plantas[i][0] != null){
                System.out.println("Fila " + i + ": " + plantas[i][0]);

            }
        }
    }

    public static void buscarPlanta(String[][] plantas, String nombre) {
        boolean planta_encontrada = false;

        for (int i = 0; i < plantas.length; i++) {
            if (plantas[i][0] != null && plantas[i][0].equalsIgnoreCase(nombre)) {
                System.out.println("Planta encontrada en la fila: "+ i + ": " + plantas[i][0]);
                planta_encontrada = true;
                break;
            }
        }
    }

    public static void regarPlanta(String[][] plantas, String nombre) {
        boolean planta_encontrada = false;

        for (int i = 0; i < plantas.length; i++) {
            if (plantas[i][0] != null && plantas[i][0].equalsIgnoreCase(nombre)){
                plantas[i][2] = "regada"; // Cambiar el estado de la planta a "regada"
                System.out.println("La planta '" + nombre + "' ha sido regada.");
                planta_encontrada = true;
                break;
            }
        }

    }

    public static void diaSiguiente(String[][] plantas) {

    }
}