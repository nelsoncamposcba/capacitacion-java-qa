package clase_2;

public class ArrayBidimensional {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];

        //      0 1 2
        //      | | |
        //      | | |
        //0 --> x o x
        //1 --> o x o
        //2 --> o o x
        tablero[0][0] = 'x';
        tablero[0][1] = 'o';
        tablero[0][2] = 'x';

        tablero[1][0] = 'o';
        tablero[1][1] = 'x';
        tablero[1][2] = 'o';

        tablero[2][0] = 'o';
        tablero[2][1] = 'o';
        tablero[2][2] = 'x';

        System.out.print(tablero[0][0]);
        System.out.print(" " + tablero[0][1]);
        System.out.print(" " + tablero[0][2]);
        System.out.println();
        System.out.print(tablero[1][0]);
        System.out.print(" " + tablero[1][1]);
        System.out.print(" " + tablero[1][2]);
        System.out.println();
        System.out.print(tablero[2][0]);
        System.out.print(" " + tablero[2][1]);
        System.out.print(" " + tablero[2][2]);
    }
}
