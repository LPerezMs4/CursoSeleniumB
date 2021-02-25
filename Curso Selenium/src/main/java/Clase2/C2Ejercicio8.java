package Clase2;

import java.util.Scanner;

public class C2Ejercicio8 {

    public static void main(String args[]){
        //5-Pedir el ingreso de números hasta que aparezca uno negativo.
        int num = 0;
        Scanner input = new Scanner(System.in);
        while (num >= 0){
            System.out.println("Ingrese un número");
            num = input.nextInt();
        }

    }
}

