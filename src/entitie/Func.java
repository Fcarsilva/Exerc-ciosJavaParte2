package entitie;

import java.util.Scanner;

public class Func {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*if (a > b && a > c) {
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }*/

        int higher = max(a, b, c);
        showResult(higher);

/*
        double y = 25.0;
        double x = Math.sqrt(y);
        System.out.println(x);
        //==============================================
*/

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;

    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}

