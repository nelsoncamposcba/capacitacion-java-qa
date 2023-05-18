package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 100: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 100) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("El número es divisible entre 3 y 5.");
            } else {
                System.out.println("El número no es divisible entre 3 y 5.");
            }

            if (numero > 50) {
                System.out.println("El número es mayor que 50.");
            } else {
                System.out.println("El número no es mayor que 50.");
            }
        } else {
            System.out.println("El número ingresado no está en el rango válido. Debe ser entre 1 y 100.");
        }

    }
}
