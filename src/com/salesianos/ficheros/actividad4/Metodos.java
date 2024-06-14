package com.salesianos.ficheros.actividad4;


import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;


public class Metodos {

    
    
    public static void nuevaMesa(Console console) {
        String fileRoute = "src/com/salesianos/ficheros/actividad4.txt";
        Gestion gestionMesa = new Gestion(fileRoute);
     
        String color = console.readLine("Escriba el color de su mesa: ");
        String patas = console.readLine("Escribe el número de patas: ");
        int nPatas = Integer.parseInt(patas);
        
        Mesa mesa = new Mesa(color, nPatas);
        try {
            gestionMesa.guardarMesa(mesa);
            System.out.println("Mesa guardada");
        } catch (IOException e) {
            System.out.println("Error ");
        }

    }



    public static void mostrarMesas() {
        String fileRoute = "src/com/salesianos/ficheros/actividad4.txt";
        Gestion gestionMesa = new Gestion(fileRoute);
        ArrayList<Mesa> mesas = gestionMesa.obtenerMesas();
        if (mesas.isEmpty()) {
            System.out.println("No hay mesas guardadas.");
        } else {
            for (Mesa mesa : mesas) {
                System.out.println(mesa);
            }
        }
    }

}
