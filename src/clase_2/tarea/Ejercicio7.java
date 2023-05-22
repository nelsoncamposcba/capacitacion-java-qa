package clase_2.tarea;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Declaramos un array con numeros enteros desordenados
        int[] numeros = {5, 9, 2, 1, 8, 4, 7, 6, 3};
        //int[] numeros = {5, 9, 2, 8};


        System.out.println("Array original: " + Arrays.toString(numeros));

        //El 1° ciclo itera todos los elementos, menos el último
        for (int i = 0; i < numeros.length - 1; i++) {

            //El 2° ciclo itera todos los elementos a partir del i+1
            for (int j = i + 1; j < numeros.length; j++) {

                //Compara si el elemento en la posición 'j' es mas grande
                //que el elemento en la posición 'i'
                //En el caso que sea verdadero, procede el cambio
                if (numeros[j] > numeros[i]) {
                    System.out.println("Hay Movimiento: " + numeros[j] + " " + numeros[i]);

                    //Se crea una variable temporal
                    int temp = numeros[i];

                    //Se intercambian los valores
                    numeros[i] = numeros[j];

                    //Reemplaza con el valor temporal
                    numeros[j] = temp;

                    System.out.println("Fin Movimiento: " + Arrays.toString(numeros));
                }

                System.out.println("Parcial: " + Arrays.toString(numeros));

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

        System.out.println("Array ordenado en orden descendente: " + cadena);
    }
}
