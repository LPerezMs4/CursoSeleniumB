package Clase3;

import java.util.Scanner;

public class C3Ejercicio18 {

    public static void main(String args[]){
        int edad = validarNumero("Ingrese su edad", "Edad inválida, reingrese!!", 0, 99);

        int salario = validarNumero("Ingrese su salario", "Salario inválido, reingrese!!", 0, 10000);

        int cantidadCertificaciones = validarNumero("Ingrese la cant de certificados", "Error, reingrese", 0, 10);

        System.out.println("Su edad es " + edad);
        System.out.println("Su salario es " + salario);
        System.out.println("Fin del programa!!");
    }

    public static int validarNumero(String mensaje, String unError, int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        int num = input.nextInt();
        while (num < min || num > max){
            System.out.println(unError + ". Ingrese un numero entre " + min + " y " + max);
            num =  input.nextInt();
        }
        return num;

    }




}
