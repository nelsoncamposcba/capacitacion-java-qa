package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = sc.nextDouble();

        double producto = numero1 * numero2;
        double potencia = Math.pow(numero3, 2); // numero3 * numero3

        if (producto > potencia) {
            System.out.println("El producto de los dos primeros números es mayor que el tercer número elevado a la segunda potencia.");
        } else {
            System.out.println("El producto de los dos primeros números no es mayor que el tercer número elevado a la segunda potencia.");
        }
    }
}
