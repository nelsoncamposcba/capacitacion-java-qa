package clase_1;

public class Operaciones {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int suma = a + b;
        System.out.println("Suma: " + suma);

        //int resta = a - b; // Resta: 7
        int resta = b - a; // Resta: -7
        System.out.println("Resta: " + resta);

        int c = 1;
        System.out.println("C: " + c); //1
        c += 1;//c = c + 1;
        System.out.println("C: " + c); //2
        c += 3;//c = c + 1;
        System.out.println("C: " + c); //5


        System.out.println("Igualdad: " + (a==b) );
        boolean mayorQue = a > b;
        System.out.println("mayor Que: " + mayorQue);

        System.out.println("AND: " + (a>b && a>c));

        System.out.println("a>b && a>c " + (a>b && a>c));
        System.out.println("b>c " + (b>c));
        System.out.println("OR: " + ((a>b && a>c) || (b>c)));

    }
}
