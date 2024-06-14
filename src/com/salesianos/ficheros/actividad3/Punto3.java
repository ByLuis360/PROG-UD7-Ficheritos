package com.salesianos.ficheros.actividad3;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Punto3 {
    public static void main(String[] args) {
        String fileRoute = "src/com/salesianos/ficheros/combinacion.txt";
        String file1 = "src/com/salesianos/ficheros/fichero.txt";
        String file2 = "src/com/salesianos/ficheros/archivo.txt";

        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(fileRoute));
                FileInputStream archivo1 = new FileInputStream(file1);
                FileInputStream archivo2 = new FileInputStream(file2);) {

            String contenido1 = "El contenido del primer archivo es: ";
            String contenido2 = "El contenido del segundo archivo es: ";

            buffered.write(contenido1);
            int charFile1 = archivo1.read();
            while (charFile1 != -1) {
                buffered.write((char) charFile1);
                charFile1 = archivo1.read();
            }

            buffered.write('\n');
            buffered.write(contenido2);
            int charFile2 = archivo2.read();
            while (charFile2 != -1) {
                buffered.write((char) charFile2);
                charFile2 = archivo2.read();
            }

        } catch (IOException e) {
            System.out.println("ERROR COMPAÑERO");
        }

    }

}
