package com.salesianos.ficheros.actividad4;

import java.io.Console;


public class Punto4 {
    public static void main(String[] args) {   
        boolean seguir = true;
        Console console = System.console();
        final String MENU = """
                Elige una opción:
                1.- Nueva mesa
                2.- Mostrar todas las mesas almacenadas
                3.- Salir del programa
                """;
        String opcion;

        while (true) {
            System.out.println(MENU);
            opcion = console.readLine();
            switch (opcion) {
                case "1":
                    Metodos.nuevaMesa(console);
                    break;
                case "2":
                    Metodos.mostrarMesas();
                    break;
            
                case "3":
                    seguir = false;
                    System.out.println("Has salido del programa");
                    break;
            
                default:
                    break;
            }
        }
        
    }
}
