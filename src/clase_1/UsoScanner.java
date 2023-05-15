package clase_1;

import java.util.Scanner;

public class UsoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = input.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = input.nextInt();

        if(a > b){
            System.out.println("a es mayor a b");
        }
        else if(a == b){
            System.out.println("a es igual a b");
        }
        else{
            System.out.println("a es menor a b");
        }
    }
}
