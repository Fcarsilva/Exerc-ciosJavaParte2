package Exercicios;

import com.sun.tools.javac.Main;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0, npares = 0, media;

        System.out.println("Quantos elementos vai ter o vetor?");
        n = sc.nextInt();

        int vetor[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero:");
            vetor[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++)
        {
            if (vetor[i] % 2 == 0) {
                soma = soma + vetor[i];
                npares++;

            }
        }

        if (npares == 0) {
            System.out.print("NENHUM NUMERO PAR");
        } else {

            media = soma / npares;

            System.out.printf("MEDIA DOS PARES =%.1f\n", media);
        }


        sc.close();
    }
}
