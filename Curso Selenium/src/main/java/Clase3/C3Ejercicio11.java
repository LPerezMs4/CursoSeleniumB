package Clase3;

import java.util.Scanner;

public class C3Ejercicio11 {

    public static  final double VALOR_DOLAR = 50;
    public static  final double VALOR_EURO = 70;
    public static  final double VALOR_IVA = 0.22;


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Cotización del dolar hoy: " + VALOR_DOLAR);
        System.out.println("Cotización del euro hoy: " + VALOR_EURO);
        System.out.println("Ingrese la cantidad de pesos a convertir");
        int pesos = input.nextInt();
        calcularDivisas(pesos);

        System.out.println("Ingrese su salario");
        double unSueldo = input.nextDouble();
        double iva = calcularIva(unSueldo);
        System.out.println("Ud. paga " + iva + "$ de IVA");

    }

    public static  void calcularDivisas(int cantidadPesos){
        double cantDolares = cantidadPesos / VALOR_DOLAR;
        double cantEuros = cantidadPesos / VALOR_EURO;

        System.out.println(cantidadPesos + " son " + cantDolares + " dolares");
        System.out.println (cantidadPesos + " son " + cantEuros + " euros");

    }

    public static double calcularIva(double sueldo){
        return sueldo * VALOR_IVA;
    }
}
