package clase_2;

public class ForBidimensional {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];

        tablero[0][0] = 'x';
        tablero[0][1] = 'o';
        tablero[0][2] = 'x';

        tablero[1][0] = 'o';
        tablero[1][1] = 'x';
        tablero[1][2] = 'o';

        tablero[2][0] = 'o';
        tablero[2][1] = 'o';
        tablero[2][2] = 'x';

        //For para las filas
        for (int i = 0; i < tablero.length; i++){
            //For para las columnas
            for (int j = 0; j < tablero[i].length; j++){
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }
    }
}
