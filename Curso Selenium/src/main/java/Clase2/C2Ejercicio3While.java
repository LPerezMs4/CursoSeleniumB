package Clase2;

import java.util.Scanner;

public class C2Ejercicio3While {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        int contador = 0;
        int suma = 0;

        while (num != 0) {
            System.out.println("Ingrese un número");
            num = input.nextInt();
            if (num != 0){
            suma = suma + num;
            //contador = contador + 1;
            contador++;
        }else {
                System.out.println("Se ha terminado la suma");
            }
        }

        System.out.println("La suma de los números es " + suma);
        System.out.println("Se ingresaron " + contador + " números");

        float promedio = suma / contador;
        System.out.println ("El promedio es " + promedio);
        System.out.println("El programa ha finalizado");

    }
}
