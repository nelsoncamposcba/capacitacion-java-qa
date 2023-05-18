package clase_1.tarea;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota: ");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota <= 10){
            if(nota >= 5){
                System.out.println("La nota es aprobatoria.");
            }
            else if(nota >= 3 && nota <= 4.9){
                System.out.println("Tiene derecho a un examen de recuperación.");
            }
            else{
                System.out.println("La nota es reprobatoria.");
            }
        }
        else{
            System.out.println("La nota ingresada es invalida. Debe ser entre 0 y 10");
        }
    }
}
