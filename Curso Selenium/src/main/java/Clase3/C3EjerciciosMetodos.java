package Clase3;

import java.util.Scanner;

public class C3EjerciciosMetodos {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número!");
        int numero = input.nextInt();

        int elDoble = calcularDoble(numero);
        System.out.println("El doble del número ingresado es " + elDoble);

        esMayora20(elDoble);

        int resultado = multiplicar(numero, elDoble);
        int suma = sumar(numero, elDoble);

        System.out.println("La multilpicación de ambos es " + resultado);
        System.out.println("La suma de ambos es " + suma);
    }

    //Escribir un método que reciba un número y retorne su doble
    public static int calcularDoble(int numero){
        return numero * 2;
    }

    //Método que reciba dos enteros y retorne la multiplicación de la misma.
    public static int multiplicar(int num1, int num2){
        System.out.println("Se multiplicará " + num1 + " * " + num2);
        int multiplicacion = num1 * num2;
        return multiplicacion;

    }

    public static int sumar(int num1, int num2){
        System.out.println("Se sumará: " + num1 + " + " + num2 + "...");
        int suma = num1 + num2;
        return suma;

    }

    //Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20, “Es mayor a 20”.
    //De lo contrario, imprimir “No es mayor a 20”.
    public static void esMayora20(int num){
        if (num > 20){
        System.out.println("El número es mayor a 20");
        } else {
            System.out.println("El número es menor o igual a 20");
        }
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }





}
