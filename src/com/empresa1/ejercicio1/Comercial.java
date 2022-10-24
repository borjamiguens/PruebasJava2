package com.empresa1.ejercicio1;

public class Comercial {


        public String nombre;
        public String idioma;


    @Override
    public String toString() {
        return "El nombre del comercial es " + nombre +
                " y habla " + idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }



}
