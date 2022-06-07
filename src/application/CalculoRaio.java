package application;


import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculoRaio {



    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //METODO USANDO  OBJETO  PARA INSTANCIAMENTO//
        //Calculator calc = new Calculator();//

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        //METODO USANDO  OBJETO  PARA INSTANCIAMENTO//
       // double c = calc.circumference(radius);//
        //double v = calc.volume(radius);//
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
        sc.close();
    }


}
