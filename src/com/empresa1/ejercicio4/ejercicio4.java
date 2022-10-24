package com.empresa1.ejercicio4;




import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado();


        /* Input lectura del empleado */

        System.out.println("Escriba el nombre del empleado :");
        empleado.nombre = sc.nextLine();


        System.out.println("¿Qué edad tiene? :");
        empleado.getEdad() = sc.nextInt();


        /* Output */

        System.out.println(empleado.toString());



    }



}
