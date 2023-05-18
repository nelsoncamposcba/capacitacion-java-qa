package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");

            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número no es par.");
            }
        } else {
            System.out.println("El número no es positivo.");
        }

        /*
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número no es positivo.");
        }
         */
    }
}
