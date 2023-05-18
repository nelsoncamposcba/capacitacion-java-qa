package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > 0 && numero2 > 0) {
            System.out.println("Ambos números son positivos.");
        } else if (numero1 > 0 && numero2 < 0) {
            System.out.println("El primer numero es positivo y el segundo negativo.");
        }
        else if (numero1 < 0 && numero2 > 0) {
            System.out.println("El primer numero es negativo y el segundo positivo.");
        }
        else{
            System.out.println("Ambos números son negativos.");
        }
    }
}
