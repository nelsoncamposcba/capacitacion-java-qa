package clase_2;

public class ForUnidimensional {

    public static void main(String[] args) {
        String[] nombres = {"Alejandro", null , "Matias"};

        for (int i = 0; i < nombres.length; i++){
            System.out.println("nombre en la posicion " + i + ": " + nombres[i]);
        }

    }
}
