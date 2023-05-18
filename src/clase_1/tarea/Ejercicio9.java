package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        /*
            Para saber si un año es bisiesto se puede aplicar una simple formula,
            la cual dice que un año es bisiesto
                - si es divisible por cuatro,
                - excepto los principios de año (los divisibles por 100),
                - que para ser bisiestos deben de ser divisibles también por 400.
         */
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }
}
