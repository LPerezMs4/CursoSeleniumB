package Clase2;

public class C2Ejercicio2For {

    public static void main (String args[]) {
        int suma = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println("i vale " + i);
            suma = suma + i; //acumulador

        }
        System.out.println("La suma entre 0 y 3 es " + suma);
        System.out.println("El programa ha finalizado!");

    }
}
