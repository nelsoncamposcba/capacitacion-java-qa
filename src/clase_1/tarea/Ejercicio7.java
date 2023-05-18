package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base * 3;

        System.out.println("El área del triángulo es: " + area);

        if (area > 50 && perimetro < 30) {
            System.out.println("Triángulo grande y corto.");
        }
    }
}
