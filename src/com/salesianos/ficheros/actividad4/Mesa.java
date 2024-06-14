package com.salesianos.ficheros.actividad4;

import java.io.Serializable;

public class Mesa implements Serializable {
    private String color;
    private int patas;

    public Mesa(String color, int patas) {
        this.color = color;
        this.patas = patas;
    }



    @Override
    public String toString() {
        String message = "El color de la mesa es " + color + ", y el numero de patas de la mesa es de: " + patas;
        return message;

    }
}
