package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la hora (formato 24 horas): ");
        int hora = sc.nextInt();

        if ((hora >= 6 && hora < 9) || (hora >= 16 && hora < 19)) {
            System.out.println("Es hora punta.");
        } else {
            System.out.println("No es hora punta.");
        }
    }
}
