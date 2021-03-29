package Clase3;

import java.util.Scanner;

public class C3Ejercicio6 {

    private static final double VALOR_PI = 3.14;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número!");
        int numero1 = input.nextInt();

        System.out.println("Ingrese el radio de un círculo");
        double radio = input.nextDouble();

        double areaCirculo = calcularArea(radio);
        System.out.println("El área del círculo es " + areaCirculo);

        boolean esNumeroPar = esPar(numero1);

        if(esNumeroPar == true){
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");

        /*
        System.out.println("Ingrese otro número!");
        int numero2 = input.nextInt();

        int mayor = obtenerMayor(numero1, numero2);
        System.out.println("El mayor numero ingresado es " + mayor);

        sumatoria(numero1);*/

    }
    }


    //Realizar un método que reciba dos números y retorne el mayor de ambos
    public static int obtenerMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void sumatoria (int num){
        int acumulador = 0;
        for (int i = 1; i <= num; i++){
            System.out.println("La sumatoria vale... " + acumulador);
            System.out.println("Se sumará el número " + i);
            acumulador = acumulador + i;
        }
        System.out.println("La sumatoria es " + acumulador);
    }

    // crear un método que retorne verdadero si y sólo si  el número es par.
        //de lo contrario, debe retornar falso.

        public static boolean esPar(int numero){
            if (numero % 2 == 0){
                return true;
            } else {
                return false;
            }
        }

     // Crear un método que reciba el radio de un círculo y retorne su área
    //(radio^2)*PI (Utilizar una variable estática para el valor de PI)

        public static double calcularArea(double radio){
        double area = radio * radio * VALOR_PI;
        return area;


         }

}



