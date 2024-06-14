package com.salesianos.ficheros.actividad4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Gestion {
    private static String fileRoute;

    public Gestion(String fileRoute) {
        Gestion.fileRoute = fileRoute;
    }

    @SuppressWarnings("unchecked")
    public  ArrayList<Mesa> obtenerMesas(){
        ArrayList<Mesa> listaMesas = new ArrayList<>();
        try {
            ObjectInputStream object = new ObjectInputStream(new FileInputStream(fileRoute));
             listaMesas = (ArrayList<Mesa>) object.readObject();
             object.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR por no encontralo"); 
        }
        return listaMesas;
    }

    public  void guardarMesa(Mesa mesa) throws IOException{
        ArrayList<Mesa> guardadoDeMesas = obtenerMesas();
        guardadoDeMesas.add(mesa);
        try {
            ObjectOutputStream objectito = new ObjectOutputStream(new FileOutputStream(fileRoute));
            objectito.writeObject(guardadoDeMesas);
            objectito.close();
        } catch (IOException e) {
            System.out.println("ERROR no se guardo");
        }
    }
}


