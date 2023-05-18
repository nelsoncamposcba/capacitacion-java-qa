package clase_2;

public class ArrayUnidimensional {

    public static void main(String[] args) {
        String[] nombres = new String[3];

        //      0        1     2
        //["Alejandro"][null][null]
        nombres[0] = "Alejandro";
        System.out.println("Valor en posicion 0: " + nombres[0]);

        //    0        1     2
        //["PABLO"][null][null]
        nombres[0] = "PABLO";
        System.out.println("El nuevo valor en posicion 0: " + nombres[0]);

        System.out.println("--------------------------------------------------");

        //    0        1     2
        //["PABLO"][null]["Matias"]
        nombres[2] = "Matias";
        System.out.println("Valor en posicion 0: " + nombres[0]);
        System.out.println("Valor en posicion 1: " + nombres[1]);
        System.out.println("El nuevo valor en posicion 2: " + nombres[2]);
        //System.out.println("Valor en posicion 3: " + nombres[3]);
    }
}
