package com.empresa1.ejercicio4;



public class Empleado {

    String nombre;
    private int edad;
    private static void mensajeError(){
        System.err.println("esto es un pifostio importante");
    }

    public void setEdad(int edad) {
        if(edad>0) this.edad = edad;
        else mensajeError();
    }

    public String toString() {
        String linea = "El empleado se llama " + nombre + "\nLa edad es " + edad;
        return linea;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}