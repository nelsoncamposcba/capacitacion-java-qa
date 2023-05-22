package clase_2.tarea;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingresa números enteros (ingresa un número negativo para detener): ");

        int numero = input.nextInt();
        while (numero >= 0) {
            suma += numero;

            System.out.print("Ingrese otro número entero (ingresa un número negativo para detener): ");
            numero = input.nextInt();
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }

}
