package Clase2;

import java.util.Scanner;

public class C2Ejercicio5 {

    //5-Pedir el ingreso de 3 números, indicar si hay números repetidos.

    public static void main(String args[]){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un número");
        num1 = input.nextInt();

        System.out.println("ingrese el segundo número");
        num2 = input.nextInt();

        System.out.println("ingrese el tercer número");
        num3 = input.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Hay números repetidos!!");
        } else {
            System.out.println("No hay números repetidos!!");
        }


    }

}
