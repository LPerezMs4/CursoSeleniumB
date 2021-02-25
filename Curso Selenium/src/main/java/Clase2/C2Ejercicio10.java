package Clase2;

import java.util.Scanner;

public class C2Ejercicio10 {

    public static void main(String args[]){

        Scanner input  = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = input.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = input.nextInt();

        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println("*** " + i);
            }
        }else {
            //num1 >= num2
            for (int i = num2; i <= num1; i++) {
                System.out.println("*** " + i);
            }
        }
    }
}
