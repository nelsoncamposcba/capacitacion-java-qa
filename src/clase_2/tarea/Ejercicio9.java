package clase_2.tarea;

import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = {5, 9, 2, 1, 8, 4, 7, 6, 3};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] % 2 == 0 && numeros[j] % 2 == 0 && numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                } else if (numeros[i] % 2 != 0 && numeros[j] % 2 != 0 && numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        String cadena = "[";
        for (int i = 0; i < numeros.length; i++) {
            cadena = cadena + numeros[i];

            if(i < (numeros.length-1)){
                cadena = cadena + ", ";
            }
        }
        cadena = cadena + "]";

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
