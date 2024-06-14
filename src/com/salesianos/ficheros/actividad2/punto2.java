package com.salesianos.ficheros.actividad2;

import java.io.FileInputStream;

public class punto2 {
    public static void main(String[] args) throws Exception {
        locationFile("src/com/salesianos/ficheros/archivo.txt");
    }

    public static void locationFile(String fileRoute) {
        try {
            FileInputStream inputFile = new FileInputStream(fileRoute);
            int charText = inputFile.read();
            while (charText != -1) {
                System.out.print(Character.toString(charText) + "_" + charText);
                charText = inputFile.read();
                if (charText != -1) {
                    System.out.print(", ");
                } 
            }
            inputFile.close();
        } catch (Exception e) {
            System.out.println("ERROR por marico");
        } 
    }

}
