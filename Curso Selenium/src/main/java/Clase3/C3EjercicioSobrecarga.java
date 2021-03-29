package Clase3;

import java.util.Scanner;

public class C3EjercicioSobrecarga {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int divisor = 3;
        int sumaTotal = suma(num1, num2, divisor, num3);
        System.out.println("La suma es " + sumaTotal);
    }

    public static int suma(int num1, int num2, int divisor){
        System.out.println("Se sumarán 2 números...");
        return num1 + num2;
    }

    public static int suma(int num1, int num2, int num3, int divisor){
        System.out.println("Se sumarán 3 números...");
        return num1 + num2 + num3;
    }

    public static int suma(int num1, int num2, int num3, int num4, int divisor){
        System.out.println("Se sumarán 4 números...");
        return num1 + num2 + num3 + num4;
    }









}
