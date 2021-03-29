package Clase2;

import java.util.Scanner;

public class C2Ejercicio1 {

    //INICIO
    public static void main(String args[]){
        //MOSTRAR "Holamundo"
        System.out.println("Bienvenidos al programa!!");

        int año = 0;
        int edad = 0;

        //TECLADO
        Scanner input = new Scanner(System.in);

        //MOSTRAR "Ingrese su nombre";
        System.out.println("Ingrese su nombre");

        //GUARDAR nombre
        String nombre = input.next();

        //MOSTRAR "Ingrese su edad"
        System.out.println("Ingrese su edad");
        edad = input.nextInt();

        año = 2020 - edad;

        //MOSTRAR "Su nombre es" + nombre
        System.out.println("Su nombre es " + nombre + " y nació en " + año);

        if (edad >= 18){
            System.out.println("Ud. es mayor de edad");
        } else {
            System.out.println("Ud. es menor de edad!");
        }

    }//FIN
}

