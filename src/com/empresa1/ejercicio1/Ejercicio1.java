package com.empresa1.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Comercial comercial1 = new Comercial();



        /* Input lectura del comercial */

        System.out.println("Escriba el nombre del comercial :");
        comercial1.nombre = sc.nextLine(); // TODO: revisar lectura de ints como chars


        System.out.println("¿Qué idioma habla? :");
        comercial1.idioma = sc.nextLine();


        /* Output */

        System.out.println(comercial1.toString());


    }


}