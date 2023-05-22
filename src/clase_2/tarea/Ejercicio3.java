package clase_2.tarea;

public class Ejercicio3 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println("Número impar: " + i);
            }

            i++;
        } while (i <= 9);

        //Otra forma
        /*
        int i = 1;
        do {
            System.out.println("Número impar: " + i);
            i += 2;
        } while (i <= 9);
         */
    }

}
