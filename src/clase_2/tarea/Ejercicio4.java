package clase_2.tarea;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 6, 8, 10, 1, 5, 0};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
    }
}
