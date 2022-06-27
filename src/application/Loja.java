package application;

import entitie.ProdutosLoja;
import entitie.SavingAccount;

import java.util.Locale;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        ProdutosLoja[] vect = new ProdutosLoja[n];

        for (int i=0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProdutosLoja(name, price);
        }
        double sum = 0.0;
        for (int i=0; i<n; i++)
            sum += vect[i].getPrice();

        double avg = sum/n;


        System.out.printf("AVERAGE PRICE= %.2f%n", avg);
        sc.close();
    }




}

