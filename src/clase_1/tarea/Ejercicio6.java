package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;

        if (suma % 2 == 0) {
            System.out.println("La suma de los números es par.");
        } else {
            System.out.println("La suma de los números es impar.");
        }

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else {
            System.out.println("El primer número no es mayor que el segundo.");
        }
    }
}
